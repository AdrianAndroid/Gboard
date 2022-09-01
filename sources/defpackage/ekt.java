package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* renamed from: ekt  reason: default package */
/* loaded from: classes.dex */
public class ekt extends RecyclerView implements chg {
    public static final ltg S = ltg.j("com/google/android/apps/inputmethod/libs/search/widget/AnimatedImageHolderView");
    public final Context T;
    public final int U;
    public final llp V;
    public eku W;
    public ekq aa;
    public boolean ab = true;
    public int ac = -1;
    public final boolean ad = true;
    public final dxs ae;
    public dxs af;
    private View ag;

    public ekt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = context;
        this.U = attributeSet.getAttributeResourceValue(null, "image_view_layout", 0);
        String attributeValue = attributeSet.getAttributeValue(null, "supported_image_types");
        if (TextUtils.isEmpty(attributeValue)) {
            this.V = llp.r("image/*");
        } else {
            this.V = llp.i(lfy.c(',').h().b().i(attributeValue));
        }
        this.ae = dxs.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String aD(Object obj) {
        if (obj instanceof bck) {
            return "image/gif";
        }
        boolean z = obj instanceof BitmapDrawable;
        return "image/*";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ly a() {
        return new LinearLayoutManager(0);
    }

    public final void aE(List list) {
        eks eksVar = (eks) this.l;
        if (eksVar != null) {
            int B = eksVar.B();
            eksVar.d.addAll(list);
            eksVar.hk(B, list.size());
            list.size();
        }
    }

    public void aF() {
        eks eksVar = (eks) this.l;
        if (eksVar != null) {
            eksVar.C();
        }
        Y(0);
    }

    public final void aG(cqp cqpVar) {
        eks eksVar = (eks) this.l;
        if (eksVar != null) {
            int indexOf = eksVar.d.indexOf(cqpVar);
            int z = eksVar.z(cqpVar);
            if (indexOf == -1 || z == -1) {
                ((ltd) ((ltd) S.d()).k("com/google/android/apps/inputmethod/libs/search/widget/AnimatedImageHolderView$SoftKeyScrollAdapter", "removeImage", 439, "AnimatedImageHolderView.java")).t("removeImage called but image not found in mImages.");
                return;
            }
            eksVar.d.remove(indexOf);
            eksVar.m(z);
        }
    }

    public final void aH(List list) {
        eks eksVar = (eks) this.l;
        if (eksVar != null) {
            eksVar.d.clear();
            eksVar.d.addAll(list);
            eksVar.fc();
        }
        Y(0);
    }

    public final void aI(View view) {
        View view2 = this.ag;
        if (view == view2) {
            return;
        }
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (view != null) {
            view.setVisibility(0);
        }
        this.ag = view;
    }

    public final boolean aJ() {
        eks eksVar = (eks) this.l;
        return eksVar != null && eksVar.x() > 0;
    }

    public final void aK() {
        this.ab = false;
    }

    public final void aL(dxs dxsVar) {
        dxs dxsVar2 = this.af;
        if (dxsVar2 != null) {
            dxsVar2.p(this);
        }
        this.af = dxsVar;
        if (dxsVar != null) {
            dxsVar.n(this, this);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ar() {
        aI((View) null);
    }

    @Override // defpackage.chg
    public final void b(Uri uri, chh chhVar) {
        eks eksVar = (eks) this.l;
        if (eksVar == null) {
            return;
        }
        List list = eksVar.d;
        for (int i = 0; i < list.size(); i++) {
            if (((cqp) list.get(i)).d().equals(uri)) {
                eksVar.hh(eksVar.A(i), chhVar);
                return;
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ab(a());
    }
}
