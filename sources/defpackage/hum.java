package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: hum  reason: default package */
/* loaded from: classes.dex */
public final class hum {
    public static final hum a = new hum();
    public final SparseArray b = new SparseArray(4);
    public final WeakHashMap c = new WeakHashMap();

    public final List a(int i) {
        ArrayList arrayList = new ArrayList(this.b.size());
        int size = this.b.size();
        while (true) {
            size--;
            if (size >= 0) {
                SoftKeyboardView softKeyboardView = (SoftKeyboardView) this.b.valueAt(size);
                htd htdVar = (htd) this.c.get(softKeyboardView);
                if (htdVar != null && htdVar.b(i, softKeyboardView)) {
                    htdVar.a(softKeyboardView);
                    this.c.remove(softKeyboardView);
                    this.b.removeAt(size);
                    arrayList.add(softKeyboardView);
                    softKeyboardView.h();
                }
            } else {
                return arrayList;
            }
        }
    }

    public final void b() {
        int size = this.b.size();
        while (true) {
            size--;
            if (size >= 0) {
                SoftKeyboardView softKeyboardView = (SoftKeyboardView) this.b.valueAt(size);
                htd htdVar = (htd) this.c.get(softKeyboardView);
                if (htdVar != null) {
                    htdVar.a(softKeyboardView);
                }
                softKeyboardView.h();
            } else {
                this.b.clear();
                this.c.clear();
                return;
            }
        }
    }
}
