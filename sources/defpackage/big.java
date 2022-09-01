package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: big  reason: default package */
/* loaded from: classes.dex */
public class big extends bij implements bii, bif {
    public List i = new ArrayList();
    public Set j = null;
    public String k = null;
    public Set l = null;
    public Set m = null;

    @Override // defpackage.bii
    public void b(bim bimVar) {
        this.i.add(bimVar);
    }

    @Override // defpackage.bif
    public final String c() {
        return this.k;
    }

    @Override // defpackage.bif
    public final Set d() {
        return this.j;
    }

    @Override // defpackage.bif
    public final Set e() {
        return this.m;
    }

    @Override // defpackage.bif
    public final Set f() {
        return this.l;
    }

    @Override // defpackage.bif
    public final Set g() {
        return null;
    }

    @Override // defpackage.bif
    public final void h(String str) {
        this.k = str;
    }

    @Override // defpackage.bif
    public final void i(Set set) {
        this.j = set;
    }

    @Override // defpackage.bif
    public final void j(Set set) {
        this.m = set;
    }

    @Override // defpackage.bif
    public final void k(Set set) {
        this.l = set;
    }

    @Override // defpackage.bif
    public final void l(Set set) {
    }

    @Override // defpackage.bii
    public final List n() {
        return this.i;
    }
}
