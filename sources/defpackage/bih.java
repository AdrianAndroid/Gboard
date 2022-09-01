package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: bih  reason: default package */
/* loaded from: classes.dex */
public class bih extends bij implements bif {
    public Set h = null;
    public String i = null;
    public Set j = null;
    public Set k = null;
    public Set l = null;

    @Override // defpackage.bif
    public final String c() {
        return this.i;
    }

    @Override // defpackage.bif
    public final Set d() {
        return this.h;
    }

    @Override // defpackage.bif
    public final Set e() {
        return this.l;
    }

    @Override // defpackage.bif
    public final Set f() {
        return this.k;
    }

    @Override // defpackage.bif
    public final Set g() {
        return this.j;
    }

    @Override // defpackage.bif
    public final void h(String str) {
        this.i = str;
    }

    @Override // defpackage.bif
    public final void i(Set set) {
        this.h = set;
    }

    @Override // defpackage.bif
    public final void j(Set set) {
        this.l = set;
    }

    @Override // defpackage.bif
    public final void k(Set set) {
        this.k = set;
    }

    @Override // defpackage.bif
    public final void l(Set set) {
        this.j = set;
    }
}
