package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ojp  reason: default package */
/* loaded from: classes2.dex */
public final class ojp implements Iterable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ojp(View view, int i) {
        this.b = i;
        this.a = view;
    }

    public ojp(Object[] objArr, int i) {
        this.b = i;
        this.a = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.b == 0) {
            return oli.a((Object[]) this.a);
        }
        return new dbi((ViewGroup) this.a);
    }
}
