package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hch  reason: default package */
/* loaded from: classes.dex */
public final class hch extends mq {
    final /* synthetic */ hci d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hch(hci hciVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.d = hciVar;
    }

    @Override // defpackage.yd
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        hcv hcvVar;
        if (accessibilityEvent.getEventType() == 1 && (hcvVar = this.d.m) != null) {
            hcvVar.b();
        }
        return super.g(viewGroup, view, accessibilityEvent);
    }
}
