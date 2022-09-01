package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: hbr  reason: default package */
/* loaded from: classes.dex */
final class hbr extends mq {
    final /* synthetic */ hbs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbr(hbs hbsVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.d = hbsVar;
    }

    @Override // defpackage.yd
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1) {
            this.d.d.b();
        }
        return super.g(viewGroup, view, accessibilityEvent);
    }
}
