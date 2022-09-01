package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.expression.header.ConstraintHeaderViewImpl;
import com.google.android.apps.inputmethod.libs.expression.header.StartElementScrollBehavior;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.DragConfirmationPopupView;
import com.google.android.libraries.inputmethod.accesspoint.widget.AccessPointBackgroundView;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: op  reason: default package */
/* loaded from: classes2.dex */
public final class op implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public op(amy amyVar, int i) {
        this.b = i;
        this.a = amyVar;
    }

    public op(bpl bplVar, int i) {
        this.b = i;
        this.a = bplVar;
    }

    public /* synthetic */ op(cny cnyVar, int i) {
        this.b = i;
        this.a = cnyVar;
    }

    public /* synthetic */ op(ConstraintHeaderViewImpl constraintHeaderViewImpl, int i) {
        this.b = i;
        this.a = constraintHeaderViewImpl;
    }

    public /* synthetic */ op(StartElementScrollBehavior startElementScrollBehavior, int i) {
        this.b = i;
        this.a = startElementScrollBehavior;
    }

    public op(DragConfirmationPopupView dragConfirmationPopupView, int i) {
        this.b = i;
        this.a = dragConfirmationPopupView;
    }

    public op(AccessPointBackgroundView accessPointBackgroundView, int i) {
        this.b = i;
        this.a = accessPointBackgroundView;
    }

    public /* synthetic */ op(dkv dkvVar, int i) {
        this.b = i;
        this.a = dkvVar;
    }

    public op(elj eljVar, int i) {
        this.b = i;
        this.a = eljVar;
    }

    public /* synthetic */ op(ghn ghnVar, int i) {
        this.b = i;
        this.a = ghnVar;
    }

    public /* synthetic */ op(grn grnVar, int i) {
        this.b = i;
        this.a = grnVar;
    }

    public /* synthetic */ op(gte gteVar, int i) {
        this.b = i;
        this.a = gteVar;
    }

    public op(hus husVar, int i) {
        this.b = i;
        this.a = husVar;
    }

    public op(kn knVar, int i) {
        this.b = i;
        this.a = knVar;
    }

    public /* synthetic */ op(opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = i;
        this.a = opuVar;
    }

    public op(oq oqVar, int i) {
        this.b = i;
        this.a = oqVar;
    }

    private static final void a(View view, float f) {
        if (view != null) {
            view.setAlpha(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, ghn] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((oq) this.a).p = valueAnimator.getAnimatedFraction();
                return;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ((kn) this.a).b.setAlpha(floatValue);
                ((kn) this.a).c.setAlpha(floatValue);
                ((kn) this.a).i();
                return;
            case 2:
                ((View) ((eh) ((opu) this.a).a).c.getParent()).invalidate();
                return;
            case 3:
                amy amyVar = (amy) this.a;
                aqg aqgVar = amyVar.j;
                if (aqgVar == null) {
                    return;
                }
                aqgVar.l(amyVar.b.c());
                return;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bpl bplVar = (bpl) this.a;
                if (!bplVar.a) {
                    floatValue2 = 1.0f - floatValue2;
                }
                bplVar.a(floatValue2);
                return;
            case 5:
                cny cnyVar = (cny) this.a;
                ViewGroup.LayoutParams layoutParams = cnyVar.d.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cnyVar.d.setLayoutParams(layoutParams);
                return;
            case 6:
                cny cnyVar2 = (cny) this.a;
                ViewGroup.LayoutParams layoutParams2 = cnyVar2.d.getLayoutParams();
                layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cnyVar2.d.setLayoutParams(layoutParams2);
                return;
            case 7:
                ConstraintHeaderViewImpl constraintHeaderViewImpl = (ConstraintHeaderViewImpl) this.a;
                constraintHeaderViewImpl.q(constraintHeaderViewImpl.j, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                Object obj = this.a;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                StartElementScrollBehavior startElementScrollBehavior = (StartElementScrollBehavior) obj;
                int i = intValue - startElementScrollBehavior.d;
                View view = startElementScrollBehavior.h;
                if (view == null) {
                    return;
                }
                int i2 = -i;
                startElementScrollBehavior.v(view, i2);
                startElementScrollBehavior.u(i2);
                startElementScrollBehavior.d = intValue;
                return;
            case 9:
                ((DragConfirmationPopupView) this.a).d.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DragConfirmationPopupView dragConfirmationPopupView = (DragConfirmationPopupView) this.a;
                dragConfirmationPopupView.c.setBounds(dragConfirmationPopupView.d.a());
                return;
            case 10:
                ((DragConfirmationPopupView) this.a).d.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DragConfirmationPopupView dragConfirmationPopupView2 = (DragConfirmationPopupView) this.a;
                dragConfirmationPopupView2.c.setBounds(dragConfirmationPopupView2.d.a());
                return;
            case 11:
                ((DragConfirmationPopupView) this.a).d.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DragConfirmationPopupView dragConfirmationPopupView3 = (DragConfirmationPopupView) this.a;
                dragConfirmationPopupView3.c.setBounds(dragConfirmationPopupView3.d.a());
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((DragConfirmationPopupView) this.a).b.setScaleX(floatValue3);
                ((DragConfirmationPopupView) this.a).b.setScaleY(floatValue3);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((dkv) this.a).f(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ViewGroup.LayoutParams layoutParams3 = ((elj) this.a).a.getLayoutParams();
                layoutParams3.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((elj) this.a).a.setLayoutParams(layoutParams3);
                return;
            case 15:
                this.a.a(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 16:
                gqx gqxVar = ((grn) this.a).c;
                if (gqxVar == null) {
                    return;
                }
                gqxVar.f(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                Object obj2 = this.a;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gra graVar = ((grn) obj2).d;
                if (graVar == null) {
                    return;
                }
                graVar.a(floatValue4);
                return;
            case 18:
                Drawable drawable = ((AccessPointBackgroundView) this.a).getDrawable();
                if (drawable == null) {
                    return;
                }
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int width = ((AccessPointBackgroundView) this.a).b.width();
                int height = ((AccessPointBackgroundView) this.a).b.height();
                int i3 = ((AccessPointBackgroundView) this.a).b.left + ((int) ((width * floatValue5) / 2.0f));
                int i4 = ((AccessPointBackgroundView) this.a).b.top + ((int) ((height * floatValue5) / 2.0f));
                drawable.setBounds(i3, i4, width - i3, height - i4);
                return;
            case 19:
                Object obj3 = this.a;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gte gteVar = (gte) obj3;
                int i5 = gteVar.a.d;
                for (int i6 = 0; i6 < i5; i6++) {
                    View view2 = (View) gteVar.a.c(i6);
                    Point point = (Point) gteVar.a.f(i6);
                    int i7 = point.x;
                    int left = view2.getLeft();
                    float f = 1.0f - floatValue6;
                    int i8 = point.y;
                    int top = view2.getTop();
                    view2.setTranslationX((i7 - left) * f);
                    view2.setTranslationY((i8 - top) * f);
                }
                return;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a(((hus) this.a).k, floatValue7);
                a(((hus) this.a).m, floatValue7);
                return;
        }
    }
}
