package defpackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bmh  reason: default package */
/* loaded from: classes.dex */
public final class bmh {
    public String a;
    public URL b;
    public List c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public bmq m;
    public StackTraceElement[] n;

    public bmh() {
        this.b = null;
        this.c = new ArrayList();
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = 3;
        this.m = bmq.a;
    }

    public final bmi a() {
        return new bmi(this);
    }

    public final void b() {
        this.d = false;
    }

    public final void c(String str, String str2) {
        jdg.u(str);
        jdg.u(str2);
        int size = this.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((bme) this.c.get(size)).a.equalsIgnoreCase(str)) {
                    this.c.remove(size);
                }
            } else {
                this.c.add(new bme(str, str2));
                return;
            }
        }
    }

    public bmh(bmi bmiVar) {
        llp llpVar = bmiVar.g;
        this.b = null;
        this.c = new ArrayList();
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = 3;
        this.m = bmq.a;
        this.b = bmiVar.e;
        this.a = bmiVar.f;
        this.c = new ArrayList(llpVar);
        this.d = bmiVar.i;
        this.e = bmiVar.j;
        this.f = bmiVar.k;
        this.g = bmiVar.h;
        this.h = bmiVar.l;
        this.i = bmiVar.m;
        this.j = bmiVar.n;
        this.k = bmiVar.o;
        this.l = bmiVar.p;
        this.m = bmiVar.r;
        this.n = bmiVar.s;
    }
}
