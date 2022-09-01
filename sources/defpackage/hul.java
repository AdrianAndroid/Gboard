package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: hul  reason: default package */
/* loaded from: classes.dex */
public final class hul implements AutoCloseable {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/keyboard/impl/SoftKeyViewsMapper");
    public final icf b;
    public SoftKeyboardView c;
    public ibi d;
    public final SparseArray e = new SparseArray();
    public long f = 0;
    public ibi g;
    public mko h;

    public hul(icf icfVar) {
        this.b = icfVar;
    }

    public final void a(long j, long j2) {
        this.f = j;
        g(j2);
        e(j2);
    }

    public final void b() {
        mko mkoVar = this.h;
        if (mkoVar != null) {
            mkoVar.cancel(true);
            this.h = null;
        }
        this.g = null;
    }

    public final void c() {
        ict ictVar;
        ibi ibiVar = this.d;
        if (ibiVar == null) {
            return;
        }
        SparseArray sparseArray = ibiVar.b;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            icy icyVar = (icy) sparseArray.valueAt(i);
            if (((this.f & icyVar.c) != 0 || icyVar.c(0L) != null) && (ictVar = (ict) icyVar.c(this.f)) != null) {
                this.e.put(keyAt, ictVar);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c = null;
        b();
    }

    public final void d() {
        SoftKeyboardView softKeyboardView = this.c;
        if (softKeyboardView != null) {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                softKeyboardView.k(this.e.keyAt(i), (ict) this.e.valueAt(i));
            }
            this.e.clear();
        }
    }

    public final void e(long j) {
        jda e;
        SoftKeyboardView softKeyboardView = this.c;
        if (softKeyboardView == null) {
            return;
        }
        SparseArray sparseArray = this.b.h.c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            icy icyVar = (icy) sparseArray.valueAt(i);
            if (j == 0 || (icyVar.c & j) != 0) {
                ict[] ictVarArr = (ict[]) icyVar.c(this.f);
                int indexOfKey = softKeyboardView.i.indexOfKey(keyAt);
                if (indexOfKey >= 0 && (e = softKeyboardView.e(indexOfKey)) != null) {
                    e.gw(ictVarArr);
                    boolean[] zArr = softKeyboardView.p;
                    if (zArr != null) {
                        zArr[indexOfKey] = true;
                    }
                }
            }
        }
    }

    public final void f() {
        g(0L);
    }

    public final void g(long j) {
        SoftKeyboardView softKeyboardView = this.c;
        if (softKeyboardView == null) {
            return;
        }
        ibi ibiVar = this.g;
        SparseArray sparseArray = ibiVar == null ? this.b.h.b : ibiVar.b;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            icy icyVar = (icy) sparseArray.valueAt(i);
            if (j == 0 || (icyVar.c & j) != 0) {
                ict ictVar = (ict) icyVar.c(this.f);
                if (this.d == null) {
                    softKeyboardView.k(keyAt, ictVar);
                } else {
                    this.e.put(keyAt, ictVar);
                }
            }
        }
        if (this.d == null) {
            return;
        }
        c();
        d();
    }
}
