package defpackage;

/* compiled from: PG */
/* renamed from: ozd  reason: default package */
/* loaded from: classes2.dex */
public final class ozd {
    public int a;

    public ozd() {
    }

    public ozd(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a > 0;
    }

    public final nwd b() {
        return new nwd(this.a);
    }

    public final void c(int i) {
        this.a = i | this.a;
    }

    public final hcm d() {
        int i = this.a;
        if (i != 0) {
            return new hcm(i);
        }
        throw new IllegalStateException("Missing required properties: layoutOrientation");
    }
}
