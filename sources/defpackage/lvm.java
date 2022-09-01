package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: lvm  reason: default package */
/* loaded from: classes.dex */
final class lvm extends lvw {
    final /* synthetic */ Set a;
    private final luy b;

    public lvm(Set set) {
        this.a = set;
        this.b = lvb.a(set);
    }

    @Override // defpackage.lvw
    public final String a(lum lumVar, lvi lviVar) {
        if (lvn.b(lumVar, lviVar, this.a)) {
            StringBuilder sb = new StringBuilder();
            lxb.e(lumVar, sb);
            lvn.d(lviVar, this.b, sb);
            return sb.toString();
        }
        return lvn.a(lumVar);
    }
}
