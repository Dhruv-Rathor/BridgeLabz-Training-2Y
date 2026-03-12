
class TextState {

    String content;

    TextState next, prev;



    TextState(String content) {

        this.content = content;

    }

}



public class TextEditorUndo {

    private TextState current;



    public void type(String newText) {

        TextState newState = new TextState(newText);

        if (current != null) {

            current.next = newState;

            newState.prev = current;

        }

        current = newState;

    }



    public void undo() {

        if (current != null && current.prev != null) {

            current = current.prev;

        }

    }



    public void display() {

        if (current != null) System.out.println("Current Text: " + current.content);

    }



    public static void main(String[] args) {

        TextEditorUndo editor = new TextEditorUndo();

        editor.type("Hello");

        editor.type("Hello World");

        editor.undo();

        editor.display();

    }

}

