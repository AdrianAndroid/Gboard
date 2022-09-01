package defpackage;

/* compiled from: PG */
/* renamed from: hh  reason: default package */
/* loaded from: classes.dex */
public final class hh implements aam {
    int a;
    final /* synthetic */ hi b;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public hh(hi hiVar) {
        this.b = hiVar;
    }

    @Override // defpackage.aam
    public final void a() {
        if (this.c) {
            return;
        }
        hi hiVar = this.b;
        hiVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.aam
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.aam
    public final void c() {
        this.c = true;
    }

    public final void d(aqq aqqVar, int i) {
        this.b.f = aqqVar;
        this.a = i;
    }
}
