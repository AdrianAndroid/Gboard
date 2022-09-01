package j$.wrapper.java.nio.file;

import java.nio.file.NoSuchFileException;

/* loaded from: classes3.dex */
final class h extends j$.nio.file.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(NoSuchFileException noSuchFileException) {
        super(noSuchFileException.getFile(), noSuchFileException.getOtherFile(), noSuchFileException.getReason());
    }
}
