package defpackage;

import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.accesspoint.widget.AccessPointsBar;
import com.google.android.libraries.inputmethod.accesspoint.widget.AccessPointsPanel;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: gtl  reason: default package */
/* loaded from: classes.dex */
public final class gtl implements gtf {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public gtl(AccessPointsBar accessPointsBar, int i) {
        this.b = i;
        this.a = accessPointsBar;
    }

    public gtl(AccessPointsPanel accessPointsPanel, int i) {
        this.b = i;
        this.a = accessPointsPanel;
    }

    @Override // defpackage.gtf
    public final SoftKeyView a() {
        if (this.b == 0) {
            ViewGroup viewGroup = this.a;
            return ((AccessPointsPanel) viewGroup).a.b(viewGroup);
        }
        ViewGroup viewGroup2 = this.a;
        return ((AccessPointsBar) viewGroup2).a.b(viewGroup2);
    }

    @Override // defpackage.gtf
    public final void b(SoftKeyView softKeyView, gqh gqhVar) {
        if (this.b == 0) {
            ((AccessPointsPanel) this.a).c(softKeyView, gqhVar);
        } else {
            ((AccessPointsBar) this.a).B(softKeyView, gqhVar);
        }
    }
}
