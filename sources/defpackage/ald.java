package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: ald  reason: default package */
/* loaded from: classes.dex */
public abstract class ald {
    private final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    public abstract int a();

    public Object b(ViewGroup viewGroup, int i) {
        throw null;
    }

    public void c(ViewGroup viewGroup, int i, Object obj) {
        throw null;
    }

    public final void d() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public final void e(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public final void f(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public final void g(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }

    public abstract boolean h(View view, Object obj);

    public void i() {
    }

    public int j() {
        return -1;
    }

    public void k(int i, Object obj) {
    }
}
