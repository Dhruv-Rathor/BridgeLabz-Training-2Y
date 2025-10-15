interface Exporter {
    void export(String data);
    default void exportToJSON(String data) {
        System.out.println("{ \"data\": \"" + data + "\" }");
    }
}
class CSVExporter implements Exporter {
    public void export(String data) {
        System.out.println("Exporting CSV: " + data);
    }
}
public class DataExporter {
    public static void main(String[] args) {
        Exporter e = new CSVExporter();
        e.export("Report");
        e.exportToJSON("Report");
    }
}
