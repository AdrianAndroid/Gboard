package defpackage;

import android.graphics.Point;
import android.view.View;
import com.google.android.libraries.inputmethod.accesspoint.widget.AccessPointsPanel;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: gtk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gtk implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gtk(AccessPointsPanel accessPointsPanel, Runnable runnable, int i) {
        this.c = i;
        this.a = accessPointsPanel;
        this.b = runnable;
    }

    public gtk(gsv gsvVar, SoftKeyView softKeyView, int i) {
        this.c = i;
        this.a = gsvVar;
        this.b = softKeyView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.c != 0) {
            if (i4 <= i2 || i3 <= i) {
                return;
            }
            view.removeOnLayoutChangeListener(this);
            jdy.i((View) this.b, null, ((gsv) this.a).c);
            gsv gsvVar = (gsv) this.a;
            gsvVar.b(gsvVar.b, new Point(gsvVar.c.centerX(), ((gsv) this.a).c.centerY()));
            return;
        }
        Object obj = this.a;
        ?? r3 = this.b;
        if (i3 - i == i7 - i5) {
            return;
        }
        AccessPointsPanel accessPointsPanel = (AccessPointsPanel) obj;
        if (accessPointsPanel.b) {
            return;
        }
        accessPointsPanel.b = true;
        accessPointsPanel.post(r3);
    }
}
