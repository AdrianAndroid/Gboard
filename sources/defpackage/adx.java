package defpackage;

import android.util.SparseArray;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: adx  reason: default package */
/* loaded from: classes.dex */
public final class adx {
    public static int c;
    public final Object a;
    public Object b;

    public adx(TextView textView) {
        this.a = textView;
    }

    public adx(st stVar) {
        this.b = null;
        this.a = new ArrayList();
        c++;
        this.b = stVar;
    }

    public final adx a(int i) {
        return (adx) ((SparseArray) this.a).get(i);
    }

    public final void b(adr adrVar, int i, int i2) {
        adx a = a(adrVar.a(i));
        if (a == null) {
            a = new adx(1);
            ((SparseArray) this.a).put(adrVar.a(i), a);
        }
        if (i2 > i) {
            a.b(adrVar, i + 1, i2);
        } else {
            a.b = adrVar;
        }
    }

    public final long c(sl slVar, long j) {
        st stVar = slVar.d;
        if (stVar instanceof sp) {
            return j;
        }
        int size = slVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            sj sjVar = (sj) slVar.j.get(i);
            if (sjVar instanceof sl) {
                sl slVar2 = (sl) sjVar;
                if (slVar2.d != stVar) {
                    j2 = Math.min(j2, c(slVar2, slVar2.e + j));
                }
            }
        }
        if (slVar != stVar.i) {
            return j2;
        }
        long a = j - stVar.a();
        return Math.min(Math.min(j2, c(stVar.h, a)), a - stVar.h.e);
    }

    public final long d(sl slVar, long j) {
        st stVar = slVar.d;
        if (stVar instanceof sp) {
            return j;
        }
        int size = slVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            sj sjVar = (sj) slVar.j.get(i);
            if (sjVar instanceof sl) {
                sl slVar2 = (sl) sjVar;
                if (slVar2.d != stVar) {
                    j2 = Math.max(j2, d(slVar2, slVar2.e + j));
                }
            }
        }
        if (slVar != stVar.h) {
            return j2;
        }
        long a = j + stVar.a();
        return Math.max(Math.max(j2, d(stVar.i, a)), a - stVar.i.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.textclassifier.TextClassifier, java.lang.Object] */
    public final TextClassifier e() {
        ?? r0 = this.b;
        return r0 == 0 ? ja.a((TextView) this.a) : r0;
    }

    private adx() {
        this(1);
    }

    public adx(int i) {
        this.a = new SparseArray(i);
    }
}
