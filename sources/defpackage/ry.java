package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ry  reason: default package */
/* loaded from: classes2.dex */
public final class ry {
    public int b;
    public boolean c;
    public final rz d;
    public ry e;
    public ru h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public ry(rz rzVar, int i) {
        this.d = rzVar;
        this.i = i;
    }

    public final int a() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public final int b() {
        ry ryVar;
        if (this.d.ah == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (ryVar = this.e) == null || ryVar.d.ah != 8) ? this.f : i;
    }

    public final void c(int i, ArrayList arrayList, ss ssVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                is.b(((ry) it.next()).d, i, arrayList, ssVar);
            }
        }
    }

    public final void d() {
        HashSet hashSet;
        ry ryVar = this.e;
        if (ryVar != null && (hashSet = ryVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void e(int i) {
        this.b = i;
        this.c = true;
    }

    public final boolean f() {
        ry ryVar;
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ry ryVar2 = (ry) it.next();
            int i = ryVar2.i - 1;
            if (i == 1) {
                ryVar = ryVar2.d.L;
            } else if (i == 2) {
                ryVar = ryVar2.d.M;
            } else if (i != 3) {
                ryVar = i != 4 ? null : ryVar2.d.K;
            } else {
                ryVar = ryVar2.d.J;
            }
            if (ryVar.h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean h() {
        return this.e != null;
    }

    public final void i() {
        ru ruVar = this.h;
        if (ruVar == null) {
            this.h = new ru(1);
        } else {
            ruVar.c();
        }
    }

    public final void j(ry ryVar, int i, int i2) {
        if (ryVar == null) {
            d();
            return;
        }
        this.e = ryVar;
        if (ryVar.a == null) {
            ryVar.a = new HashSet();
        }
        HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final String toString() {
        String str;
        String str2 = this.d.ai;
        switch (this.i) {
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = "BASELINE";
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        return str2 + ":" + str;
    }
}
