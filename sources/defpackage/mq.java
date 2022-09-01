package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: mq  reason: default package */
/* loaded from: classes2.dex */
public class mq extends yd {
    final RecyclerView a;
    public final mp b;

    public mq(RecyclerView recyclerView) {
        this.a = recyclerView;
        yd j = j();
        if (j == null || !(j instanceof mp)) {
            this.b = new mp(this);
        } else {
            this.b = (mp) j;
        }
    }

    @Override // defpackage.yd
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        ly lyVar;
        super.a(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k() || (lyVar = ((RecyclerView) view).m) == null) {
            return;
        }
        lyVar.Y(accessibilityEvent);
    }

    @Override // defpackage.yd
    public final void b(View view, abj abjVar) {
        ly lyVar;
        super.b(view, abjVar);
        if (k() || (lyVar = this.a.m) == null) {
            return;
        }
        RecyclerView recyclerView = lyVar.s;
        lyVar.q(recyclerView.e, recyclerView.J, abjVar);
    }

    @Override // defpackage.yd
    public final boolean h(View view, int i, Bundle bundle) {
        ly lyVar;
        if (super.h(view, i, bundle)) {
            return true;
        }
        if (k() || (lyVar = this.a.m) == null) {
            return false;
        }
        RecyclerView recyclerView = lyVar.s;
        return lyVar.bg(recyclerView.e, recyclerView.J, i, bundle);
    }

    public yd j() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.a.al();
    }
}
