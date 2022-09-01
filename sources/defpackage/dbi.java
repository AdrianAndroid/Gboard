package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: dbi  reason: default package */
/* loaded from: classes.dex */
public final class dbi implements Iterator {
    private final ArrayDeque a;

    public dbi(ViewGroup viewGroup) {
        ArrayDeque a = lre.a();
        this.a = a;
        a.push(viewGroup);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a.isEmpty();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        View view = (View) this.a.pop();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                this.a.push(viewGroup.getChildAt(childCount));
            }
        }
        return view;
    }
}
