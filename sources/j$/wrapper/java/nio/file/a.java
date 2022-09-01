package j$.wrapper.java.nio.file;

import java.nio.file.AtomicMoveNotSupportedException;

/* loaded from: classes3.dex */
final class c extends j$.nio.file.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
        super(atomicMoveNotSupportedException.getFile(), atomicMoveNotSupportedException.getOtherFile(), atomicMoveNotSupportedException.getReason());
    }
}
