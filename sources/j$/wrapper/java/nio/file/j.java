package j$.wrapper.java.nio.file;

import java.nio.file.NotLinkException;

/* loaded from: classes3.dex */
final class j extends j$.nio.file.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(NotLinkException notLinkException) {
        super(notLinkException.getFile(), notLinkException.getOtherFile(), notLinkException.getReason());
    }
}
