package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: s  reason: default package */
/* loaded from: classes2.dex */
public final class s extends bq implements bd, bg {
    final bi a;
    boolean b;
    int c;

    public s(bi biVar) {
        biVar.f();
        au auVar = biVar.i;
        if (auVar != null) {
            auVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = biVar;
    }

    @Override // defpackage.bd
    public final int a() {
        return this.m;
    }

    @Override // defpackage.bd
    public final CharSequence b() {
        int i = this.m;
        return i != 0 ? this.a.i.c.getText(i) : this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        if (!this.j) {
            return;
        }
        if (bi.S(2)) {
            new StringBuilder("Bump nesting in ").append(this);
        }
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            bp bpVar = (bp) this.d.get(i2);
            an anVar = bpVar.b;
            if (anVar != null) {
                anVar.y += i;
                if (bi.S(2)) {
                    new StringBuilder("Bump nesting of ").append(bpVar.b);
                    int i3 = bpVar.b.y;
                }
            }
        }
    }

    @Override // defpackage.bq
    public final void d() {
        q();
        this.a.F(this, false);
    }

    @Override // defpackage.bq
    public final void e() {
        q();
        this.a.F(this, true);
    }

    @Override // defpackage.bq
    public final void f(int i, an anVar, String str, int i2) {
        String str2 = anVar.V;
        if (str2 != null) {
            aez.a(anVar, str2);
        }
        Class<?> cls = anVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = anVar.F;
                if (str3 == null || str.equals(str3)) {
                    anVar.F = str;
                } else {
                    throw new IllegalStateException("Can't change tag of fragment " + anVar + ": was " + anVar.F + " now " + str);
                }
            }
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Can't add fragment " + anVar + " with tag " + str + " to container view with no id");
                }
                int i3 = anVar.D;
                if (i3 == 0 || i3 == i) {
                    anVar.D = i;
                    anVar.E = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + anVar + ": was " + anVar.D + " now " + i);
                }
            }
            n(new bp(i2, anVar));
            anVar.z = this.a;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void g(String str, PrintWriter printWriter) {
        h(str, printWriter, true);
    }

    public final void h(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (!this.d.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                bp bpVar = (bp) this.d.get(i);
                switch (bpVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + bpVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(bpVar.b);
                if (z) {
                    if (bpVar.d != 0 || bpVar.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(bpVar.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(bpVar.e));
                    }
                    if (bpVar.f != 0 || bpVar.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(bpVar.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(bpVar.g));
                    }
                }
            }
        }
    }

    @Override // defpackage.bg
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        if (bi.S(2)) {
            new StringBuilder("Run: ").append(this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (this.j) {
            bi biVar = this.a;
            if (biVar.b == null) {
                biVar.b = new ArrayList();
            }
            biVar.b.add(this);
            return true;
        }
        return true;
    }

    @Override // defpackage.bq
    public final void j() {
        l(false);
    }

    @Override // defpackage.bq
    public final void k() {
        l(true);
    }

    final void l(boolean z) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (bi.S(2)) {
            new StringBuilder("Commit: ").append(this);
            PrintWriter printWriter = new PrintWriter(new bv());
            g("  ", printWriter);
            printWriter.close();
        }
        this.b = true;
        if (this.j) {
            this.c = this.a.e.getAndIncrement();
        } else {
            this.c = -1;
        }
        this.a.E(this, z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.bq
    public final void m(an anVar) {
        bi biVar = anVar.z;
        if (biVar == null || biVar == this.a) {
            n(new bp(3, anVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + anVar.toString() + " is already attached to a FragmentManager.");
    }
}
