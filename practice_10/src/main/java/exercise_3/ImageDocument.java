package exercise_3;

public class ImageDocument implements IDocument {
    private String document;
    public ImageDocument(){
        this.document = "Image document -> :)";
    }



    public String infoDocument() {

        return document;
    }
}
