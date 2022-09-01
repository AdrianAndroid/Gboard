package defpackage;

import android.view.View;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.ScrollableCandidatesHolderView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bqf  reason: default package */
/* loaded from: classes.dex */
public final class bqf {
    ScrollableCandidatesHolderView a;
    View b;
    public View c;
    public float d;
    public int e;
    public boolean f = false;
    private final bqe g;

    public bqf(bqe bqeVar) {
        this.g = bqeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        ScrollableCandidatesHolderView scrollableCandidatesHolderView = this.a;
        if (scrollableCandidatesHolderView == null || scrollableCandidatesHolderView.S.isEmpty()) {
            return;
        }
        scrollableCandidatesHolderView.S.clear();
        scrollableCandidatesHolderView.ad = null;
        scrollableCandidatesHolderView.aa = null;
        scrollableCandidatesHolderView.U.fc();
        scrollableCandidatesHolderView.Y(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.b != null) {
            this.g.a().e(ice.HEADER, R.id.f67960_resource_name_obfuscated_res_0x7f0b08ab, true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.g.a().i(ice.HEADER, R.id.f67960_resource_name_obfuscated_res_0x7f0b08ab, false, hwv.DEFAULT, true);
    }
}
