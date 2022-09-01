package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rs  reason: default package */
/* loaded from: classes2.dex */
public final class rs {
    ru a;
    final /* synthetic */ rt b;

    public rs(rt rtVar) {
        this.b = rtVar;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + " ";
            }
        }
        return str + "] " + String.valueOf(this.a);
    }
}
