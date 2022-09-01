package defpackage;

/* compiled from: PG */
/* renamed from: opl  reason: default package */
/* loaded from: classes2.dex */
public final class opl {
    public final boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public opl(ogu oguVar) {
        this.a = oguVar.b;
        this.b = oguVar.c;
        this.c = oguVar.d;
        this.d = oguVar.e;
    }

    public opl(opm opmVar) {
        this.a = opmVar.c;
        this.b = opmVar.e;
        this.c = opmVar.f;
        this.d = opmVar.d;
    }

    public opl(boolean z) {
        this.a = z;
    }

    public final opm a() {
        return new opm(this);
    }

    public final void b(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.b = (String[]) strArr.clone();
    }

    public final void c() {
        if (this.a) {
            this.d = true;
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final void d(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.c = (String[]) strArr.clone();
    }

    public final void e(opj... opjVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[opjVarArr.length];
        for (int i = 0; i < opjVarArr.length; i++) {
            strArr[i] = opjVarArr[i].t;
        }
        b(strArr);
    }

    public final void f(oqp... oqpVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[oqpVarArr.length];
        for (int i = 0; i < oqpVarArr.length; i++) {
            strArr[i] = oqpVarArr[i].f;
        }
        d(strArr);
    }

    public final ogu g() {
        return new ogu(this, null);
    }

    public final void h(ogt... ogtVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[ogtVarArr.length];
        for (int i = 0; i < ogtVarArr.length; i++) {
            strArr[i] = ogtVarArr[i].bb;
        }
        this.b = strArr;
    }

    public final void i(String... strArr) {
        if (this.a) {
            if (strArr == null) {
                this.b = null;
                return;
            } else {
                this.b = (String[]) strArr.clone();
                return;
            }
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final void j() {
        if (this.a) {
            this.d = true;
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final void k(ohd... ohdVarArr) {
        if (this.a) {
            String[] strArr = new String[ohdVarArr.length];
            for (int i = 0; i < ohdVarArr.length; i++) {
                strArr[i] = ohdVarArr[i].f;
            }
            this.c = strArr;
            return;
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final void l(String... strArr) {
        if (this.a) {
            if (strArr == null) {
                this.c = null;
                return;
            } else {
                this.c = (String[]) strArr.clone();
                return;
            }
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }
}
