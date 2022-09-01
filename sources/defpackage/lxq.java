package defpackage;

import java.io.Serializable;
import java.util.zip.Checksum;

/* compiled from: PG */
/* renamed from: lxq  reason: default package */
/* loaded from: classes.dex */
final class lxq extends lxm implements Serializable {
    private static final long serialVersionUID = 0;
    private final lxz a;
    private final String b;

    public lxq(lxz lxzVar, String str) {
        this.a = lxzVar;
        jdg.y(true, "bits (%s) must be either 32 or 64", 32);
        this.b = str;
    }

    @Override // defpackage.lxu
    public final lxv b() {
        return new lxp((Checksum) this.a.a());
    }

    public final String toString() {
        return this.b;
    }
}
