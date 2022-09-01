package j$.wrapper.java.nio.file;

import java.nio.file.FileSystemException;

/* loaded from: classes3.dex */
final class f extends j$.nio.file.b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(FileSystemException fileSystemException) {
        super(fileSystemException.getFile(), fileSystemException.getOtherFile(), fileSystemException.getReason());
    }
}
