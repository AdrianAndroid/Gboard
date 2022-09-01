package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ab  reason: default package */
/* loaded from: classes.dex */
public class ab {
    public final bz a;
    public final wq b;

    public ab(bz bzVar, wq wqVar) {
        this.a = bzVar;
        this.b = wqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        bz bzVar = this.a;
        if (!bzVar.b.remove(this.b) || !bzVar.b.isEmpty()) {
            return;
        }
        bzVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        int s = cd.s(this.a.a.O);
        int i = this.a.e;
        if (s != i) {
            return (s == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
