package defpackage;

import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fam  reason: default package */
/* loaded from: classes.dex */
public final class fam implements fev {
    public final ffd a;
    final /* synthetic */ fan b;
    public final fcp c;
    private final fev d;

    public fam(fan fanVar, ffd ffdVar, fcp fcpVar, fev fevVar) {
        this.b = fanVar;
        this.d = fevVar;
        this.a = ffdVar;
        this.c = fcpVar;
    }

    @Override // defpackage.fev
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.fev
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.fev
    public final void c() {
        this.d.c();
    }

    @Override // defpackage.fev
    public final void d(int i) {
        this.d.d(i);
    }

    @Override // defpackage.fev
    public final void e() {
        if (this.b.f.a().equals(few.AIAI)) {
            this.b.a.execute(new fal(this, 0));
            return;
        }
        if (this.b.f.a().equals(few.S3) && ((Boolean) ffa.m.c()).booleanValue()) {
            fex a = this.b.c.a(fao.f, this.a);
            if (a != null) {
                this.b.f.c(fff.INITIALIZATION_ERROR);
                this.b.f.d();
                this.b.f = a;
                this.b.f.e(this.a, this.c, this.d, this.b.b.aj(R.string.f160410_resource_name_obfuscated_res_0x7f140646));
                return;
            }
        }
        this.d.e();
    }

    @Override // defpackage.fev
    public final void f() {
        this.d.f();
    }

    @Override // defpackage.fev
    public final void g() {
        this.d.g();
    }

    @Override // defpackage.fev
    public final void h() {
        this.d.h();
    }

    @Override // defpackage.fev
    public final void i(bnq bnqVar) {
        this.d.i(bnqVar);
    }

    @Override // defpackage.fev
    public final void j(int i) {
        this.d.j(i);
    }
}
