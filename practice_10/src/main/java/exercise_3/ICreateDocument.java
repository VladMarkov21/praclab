package exercise_3;

public interface ICreateDocument {
    public TextDocument createNewText();

    public ImageDocument createNewImage();

    public MusicDocument createNewMusic();

    public String createOpenMusic(IDocument iDocument);

    public String createOpenText(IDocument iDocument);

    public String createOpenImage(IDocument iDocument);
}
