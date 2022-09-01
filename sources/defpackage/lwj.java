package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: lwj  reason: default package */
/* loaded from: classes.dex */
public final class lwj extends lwg {
    public static final lwg a = new lwj();

    private lwj() {
    }

    @Override // defpackage.lwg
    public final lun a(String str) {
        return new lwd(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
