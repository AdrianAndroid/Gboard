package j$.wrapper.java.nio.file;

import java.nio.file.DirectoryNotEmptyException;

/* loaded from: classes3.dex */
final class d extends j$.nio.file.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(DirectoryNotEmptyException directoryNotEmptyException) {
        super(directoryNotEmptyException.getFile());
    }
}
