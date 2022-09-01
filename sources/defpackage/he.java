package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.inputmethod.libs.expression.widget.ShowIfRoomImageView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: he  reason: default package */
/* loaded from: classes.dex */
public final class he implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ he(ShowIfRoomImageView showIfRoomImageView, int i) {
        this.b = i;
        this.a = showIfRoomImageView;
    }

    public he(gg ggVar, int i) {
        this.b = i;
        this.a = ggVar;
    }

    public he(hf hfVar, int i) {
        this.b = i;
        this.a = hfVar;
    }

    public /* synthetic */ he(iml imlVar, int i) {
        this.b = i;
        this.a = imlVar;
    }

    public he(iw iwVar, int i) {
        this.b = i;
        this.a = iwVar;
    }

    public he(iz izVar, int i) {
        this.b = i;
        this.a = izVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        int i = this.b;
        if (i == 0) {
            if (!((hf) this.a).u()) {
                return;
            }
            hf hfVar = (hf) this.a;
            if (hfVar.a.p) {
                return;
            }
            View view2 = hfVar.c;
            if (view2 == null || !view2.isShown()) {
                ((hf) this.a).k();
                return;
            } else {
                ((hf) this.a).a.s();
                return;
            }
        }
        if (i == 1) {
            if (!((gg) this.a).u() || ((gg) this.a).b.size() <= 0 || ((lg) ((nwo) ((gg) this.a).b.get(0)).b).p) {
                return;
            }
            View view3 = ((gg) this.a).d;
            if (view3 == null || !view3.isShown()) {
                ((gg) this.a).k();
                return;
            }
            for (nwo nwoVar : ((gg) this.a).b) {
                ((lg) nwoVar.b).s();
            }
        } else if (i == 2) {
            if (!((iz) this.a).b.u()) {
                ((iz) this.a).b();
            }
            ViewTreeObserver viewTreeObserver = ((iz) this.a).getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            iq.a(viewTreeObserver, this);
        } else if (i == 3) {
            iw iwVar = (iw) this.a;
            iz izVar = iwVar.d;
            if (!aad.ag(izVar) || !izVar.getGlobalVisibleRect(iwVar.c)) {
                ((lg) this.a).k();
                return;
            }
            ((iw) this.a).n();
            iw.m((iw) this.a);
        } else if (i == 4) {
            ShowIfRoomImageView showIfRoomImageView = (ShowIfRoomImageView) this.a;
            if (showIfRoomImageView.getVisibility() == 8 || (view = (View) showIfRoomImageView.getParent()) == null) {
                return;
            }
            if (showIfRoomImageView.getLeft() >= 0 && showIfRoomImageView.getTop() >= 0 && showIfRoomImageView.getRight() <= view.getWidth() && showIfRoomImageView.getBottom() <= view.getHeight()) {
                return;
            }
            showIfRoomImageView.setVisibility(8);
            view.invalidate();
            view.requestLayout();
        } else {
            iml imlVar = (iml) this.a;
            boolean q = imlVar.q();
            int i2 = imlVar.a.d;
            Rect rect = new Rect();
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                View view4 = (View) imlVar.a.c(i3);
                imk imkVar = (imk) imlVar.a.f(i3);
                jdy.j(imkVar.a, rect);
                if (!imkVar.a.isShown() && (imkVar.d & 2048) != 0) {
                    arrayList.add(view4);
                } else if (q || !rect.equals(imkVar.e)) {
                    imkVar.e.set(rect);
                    imlVar.i(view4, imkVar.a, imkVar.d, imkVar.b, imkVar.c);
                }
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                imlVar.c((View) arrayList.get(i4), null, true);
            }
        }
    }
}
