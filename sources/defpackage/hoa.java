package defpackage;

import android.view.inputmethod.CursorAnchorInfo;
import com.google.android.apps.inputmethod.libs.framework.core.FloatingCandidatesWindow;

/* compiled from: PG */
/* renamed from: hoa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hoa implements gza {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hoa(dcu dcuVar, int i) {
        this.b = i;
        this.a = dcuVar;
    }

    public /* synthetic */ hoa(hoe hoeVar, int i) {
        this.b = i;
        this.a = hoeVar;
    }

    @Override // defpackage.gza
    public final void a(CursorAnchorInfo cursorAnchorInfo) {
        FloatingCandidatesWindow floatingCandidatesWindow;
        if (this.b != 0) {
            dcu dcuVar = (dcu) this.a;
            hox P = dcuVar.P();
            if (P == null || (floatingCandidatesWindow = dcuVar.u) == null) {
                return;
            }
            int[] tempWindowLocation = floatingCandidatesWindow.getTempWindowLocation();
            hpi hpiVar = P.e;
            if (hpiVar.n()) {
                hpiVar.c.s(cursorAnchorInfo, tempWindowLocation);
            }
            FloatingCandidatesWindow floatingCandidatesWindow2 = dcuVar.u;
            floatingCandidatesWindow2.updateWindowLocationAndMaybeMove(floatingCandidatesWindow2.getTempWindowLocation(), true);
            return;
        }
        hoe hoeVar = (hoe) this.a;
        hoeVar.w = hjg.m(cursorAnchorInfo, 3);
        hoeVar.x = true;
        if (hoeVar.u == null) {
            return;
        }
        CharSequence charSequence = hoeVar.y;
        if (charSequence != null) {
            hoeVar.o(charSequence);
            hoeVar.y = null;
        }
        hoeVar.s();
        hoeVar.r();
        hoeVar.q();
        hoeVar.h();
    }
}
