package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: sl  reason: default package */
/* loaded from: classes2.dex */
public class sl implements sj {
    public final st d;
    public int e;
    public int f;
    public sj a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    sm h = null;
    public boolean i = false;
    public final List j = new ArrayList();
    final List k = new ArrayList();

    public sl(st stVar) {
        this.d = stVar;
    }

    public final void a(sj sjVar) {
        this.j.add(sjVar);
        if (this.i) {
            sjVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        for (sj sjVar : this.j) {
            sjVar.f();
        }
    }

    @Override // defpackage.sj
    public final void f() {
        for (sl slVar : this.k) {
            if (!slVar.i) {
                return;
            }
        }
        this.c = true;
        sj sjVar = this.a;
        if (sjVar != null) {
            sjVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        sl slVar2 = null;
        int i = 0;
        for (sl slVar3 : this.k) {
            if (!(slVar3 instanceof sm)) {
                i++;
                slVar2 = slVar3;
            }
        }
        if (slVar2 != null && i == 1 && slVar2.i) {
            sm smVar = this.h;
            if (smVar != null) {
                if (!smVar.i) {
                    return;
                }
                this.e = this.g * smVar.f;
            }
            c(slVar2.f + this.e);
        }
        sj sjVar2 = this.a;
        if (sjVar2 == null) {
            return;
        }
        sjVar2.f();
    }

    public final String toString() {
        String str;
        String str2 = this.d.d.ai;
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        String obj = (this.i ? Integer.valueOf(this.f) : "unresolved").toString();
        int size = this.k.size();
        int size2 = this.j.size();
        return str2 + ":" + str + "(" + obj + ") <t=" + size + ":d=" + size2 + ">";
    }
}
