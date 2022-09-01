package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: agv  reason: default package */
/* loaded from: classes.dex */
public final class agv extends agd implements ahb {
    public final int j = 54321;
    public final ahc k;
    public agw l;
    private afv m;

    public agv(ahc ahcVar) {
        this.k = ahcVar;
        if (ahcVar.e == null) {
            ahcVar.e = this;
            ahcVar.d = 54321;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agc
    public final void e() {
        if (agu.b(2)) {
            new StringBuilder("  Starting: ").append(this);
        }
        ahc ahcVar = this.k;
        ahcVar.g = true;
        ahcVar.i = false;
        ahcVar.h = false;
        aha ahaVar = (aha) ahcVar;
        List list = ahaVar.c;
        if (list != null) {
            ahaVar.b(list);
            return;
        }
        ahcVar.d();
        ahaVar.a = new agz(ahaVar);
        ahaVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agc
    public final void f() {
        if (agu.b(2)) {
            new StringBuilder("  Stopping: ").append(this);
        }
        ahc ahcVar = this.k;
        ahcVar.g = false;
        ahcVar.d();
    }

    @Override // defpackage.agc
    public final void g(age ageVar) {
        super.g(ageVar);
        this.m = null;
        this.l = null;
    }

    public final void j() {
        afv afvVar = this.m;
        agw agwVar = this.l;
        if (afvVar == null || agwVar == null) {
            return;
        }
        super.g(agwVar);
        d(afvVar, agwVar);
    }

    public final void k() {
        if (agu.b(3)) {
            new StringBuilder("  Destroying: ").append(this);
        }
        this.k.d();
        this.k.h = true;
        agw agwVar = this.l;
        if (agwVar != null) {
            g(agwVar);
            if (agwVar.c) {
                if (agu.b(2)) {
                    new StringBuilder("  Resetting: ").append(agwVar.a);
                }
                knb knbVar = (knb) agwVar.b;
                knbVar.a.clear();
                knbVar.a.notifyDataSetChanged();
            }
        }
        ahc ahcVar = this.k;
        ahb ahbVar = ahcVar.e;
        if (ahbVar != null) {
            if (ahbVar == this) {
                ahcVar.e = null;
                ahcVar.i = true;
                ahcVar.g = false;
                ahcVar.h = false;
                ahcVar.j = false;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public final void l(afv afvVar, agt agtVar) {
        agw agwVar = new agw(this.k, agtVar);
        d(afvVar, agwVar);
        age ageVar = this.l;
        if (ageVar != null) {
            g(ageVar);
        }
        this.m = afvVar;
        this.l = agwVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.j);
        sb.append(" : ");
        sb.append(this.k.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.k)));
        sb.append("}}");
        return sb.toString();
    }
}
