package j$.wrapper.java.nio.file;

import java.nio.file.FileAlreadyExistsException;

/* loaded from: classes3.dex */
final class e extends j$.nio.file.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(FileAlreadyExistsException fileAlreadyExistsException) {
        super(fileAlreadyExistsException.getFile(), fileAlreadyExistsException.getOtherFile(), fileAlreadyExistsException.getReason());
    }
}
