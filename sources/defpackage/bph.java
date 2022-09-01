package defpackage;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.apps.inputmethod.libs.clipboard.ClipboardKeyboard;
import com.google.android.apps.inputmethod.libs.expression.header.ConstraintHeaderViewImpl;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardTablet;
import com.google.android.apps.inputmethod.libs.translate.TranslateKeyboard;
import com.google.android.inputmethod.latin.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bph  reason: default package */
/* loaded from: classes.dex */
public final class bph implements View.OnTouchListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bph(bpi bpiVar, int i) {
        this.b = i;
        this.a = bpiVar;
    }

    public bph(bqa bqaVar, int i) {
        this.b = i;
        this.a = bqaVar;
    }

    public /* synthetic */ bph(bud budVar, int i) {
        this.b = i;
        this.a = budVar;
    }

    public /* synthetic */ bph(ClipboardKeyboard clipboardKeyboard, int i) {
        this.b = i;
        this.a = clipboardKeyboard;
    }

    public bph(ConstraintHeaderViewImpl constraintHeaderViewImpl, int i) {
        this.b = i;
        this.a = constraintHeaderViewImpl;
    }

    public /* synthetic */ bph(EmoticonKeyboardM2 emoticonKeyboardM2, int i) {
        this.b = i;
        this.a = emoticonKeyboardM2;
    }

    public /* synthetic */ bph(EmoticonKeyboardTablet emoticonKeyboardTablet, int i) {
        this.b = i;
        this.a = emoticonKeyboardTablet;
    }

    public /* synthetic */ bph(TranslateKeyboard translateKeyboard, int i) {
        this.b = i;
        this.a = translateKeyboard;
    }

    public bph(epr eprVar, int i) {
        this.b = i;
        this.a = eprVar;
    }

    public bph(hus husVar, int i) {
        this.b = i;
        this.a = husVar;
    }

    public bph(hva hvaVar, int i) {
        this.b = i;
        this.a = hvaVar;
    }

    public bph(hwg hwgVar, int i) {
        this.b = i;
        this.a = hwgVar;
    }

    public bph(lg lgVar, int i) {
        this.b = i;
        this.a = lgVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        hus husVar;
        View view2;
        cop copVar = null;
        switch (this.b) {
            case 0:
                if (motionEvent.getAction() == 4) {
                    ((bpi) this.a).i();
                }
                return false;
            case 1:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0) {
                    PopupWindow popupWindow = ((lg) this.a).q;
                    if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < ((lg) this.a).q.getWidth() && y >= 0 && y < ((lg) this.a).q.getHeight()) {
                        lg lgVar = (lg) this.a;
                        lgVar.o.postDelayed(lgVar.r, 250L);
                    }
                } else if (action == 1) {
                    lg lgVar2 = (lg) this.a;
                    lgVar2.o.removeCallbacks(lgVar2.r);
                }
                return false;
            case 2:
                if (motionEvent.getAction() == 1) {
                    bqa bqaVar = (bqa) this.a;
                    if (bqaVar.e.getY() > bqaVar.j + (bqaVar.k / 2)) {
                        ((bqa) this.a).c(250L);
                        return true;
                    }
                }
                return ((bqa) this.a).n.onTouchEvent(motionEvent);
            case 3:
                ((bqa) this.a).b();
                return false;
            case 4:
                ((bud) this.a).g();
                view.setOnTouchListener(null);
                return true;
            case 5:
                Object obj = this.a;
                if (motionEvent.getAction() == 4 && motionEvent.getX() == 0.0f && motionEvent.getY() == 0.0f) {
                    ((ClipboardKeyboard) obj).A();
                }
                return true;
            case 6:
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        return false;
                    }
                    float rawX = motionEvent.getRawX();
                    ConstraintHeaderViewImpl constraintHeaderViewImpl = (ConstraintHeaderViewImpl) this.a;
                    float f = constraintHeaderViewImpl.n;
                    constraintHeaderViewImpl.n = motionEvent.getRawX();
                    int i = (int) (rawX - f);
                    ConstraintHeaderViewImpl constraintHeaderViewImpl2 = (ConstraintHeaderViewImpl) this.a;
                    ViewGroup.LayoutParams layoutParams = constraintHeaderViewImpl2.j.getLayoutParams();
                    if (constraintHeaderViewImpl2.getLayoutDirection() == 1) {
                        i = -i;
                    }
                    constraintHeaderViewImpl2.q(constraintHeaderViewImpl2.j, Math.min(Math.max(constraintHeaderViewImpl2.q, layoutParams.width + i), constraintHeaderViewImpl2.g()));
                } else if (((ConstraintHeaderViewImpl) this.a).j.getLayoutParams().width <= ((ConstraintHeaderViewImpl) this.a).g() / 2) {
                    ((ConstraintHeaderViewImpl) this.a).l();
                    ((ConstraintHeaderViewImpl) this.a).setOnTouchListener(null);
                } else {
                    ConstraintHeaderViewImpl constraintHeaderViewImpl3 = (ConstraintHeaderViewImpl) this.a;
                    ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(constraintHeaderViewImpl3.getContext(), R.animator.f450_resource_name_obfuscated_res_0x7f02000c);
                    valueAnimator.setIntValues(constraintHeaderViewImpl3.j.getWidth(), constraintHeaderViewImpl3.g());
                    com i2 = constraintHeaderViewImpl3.i();
                    if (i2 == null) {
                        ((luc) ((luc) ConstraintHeaderViewImpl.i.c()).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "expandSearchBox", 668, "ConstraintHeaderViewImpl.java")).t("expandSearchBox() : Cannot find original image resource info.");
                    } else {
                        coq coqVar = constraintHeaderViewImpl3.l.b().a;
                        if (coqVar == null) {
                            ((luc) ConstraintHeaderViewImpl.i.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "getOriginalTextResourceInfo", 696, "ConstraintHeaderViewImpl.java")).t("getOriginalTextResourceInfo() : Cannot find original start element.");
                        } else {
                            copVar = coqVar.c;
                        }
                        if (copVar == null) {
                            ((luc) ((luc) ConstraintHeaderViewImpl.i.c()).k("com/google/android/apps/inputmethod/libs/expression/header/ConstraintHeaderViewImpl", "expandSearchBox", 673, "ConstraintHeaderViewImpl.java")).t("expandSearchBox() : Cannot find original text resource info.");
                        } else {
                            cog.c();
                            constraintHeaderViewImpl3.k(valueAnimator, cog.a(i2.c, copVar.a));
                        }
                    }
                }
                return true;
            case 7:
                EmoticonKeyboardM2 emoticonKeyboardM2 = (EmoticonKeyboardM2) this.a;
                if (!emoticonKeyboardM2.d.e || motionEvent.getAction() != 0) {
                    return false;
                }
                emoticonKeyboardM2.d.o(view);
                return true;
            case 8:
                EmoticonKeyboardTablet emoticonKeyboardTablet = (EmoticonKeyboardTablet) this.a;
                if (!emoticonKeyboardTablet.c.e || motionEvent.getAction() != 0) {
                    return false;
                }
                emoticonKeyboardTablet.c.o(view);
                return true;
            case 9:
                return (((epr) this.a).m.isInProgress() || ((epr) this.a).m.isInProgress()) ? ((epr) this.a).m.onTouchEvent(motionEvent) : ((epr) this.a).n.onTouchEvent(motionEvent);
            case 10:
                View.OnTouchListener onTouchListener = ((TranslateKeyboard) this.a).e;
                if (onTouchListener != null) {
                    onTouchListener.onTouch(view, motionEvent);
                }
                return false;
            case 11:
                if (!((hus) this.a).d.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && motionEvent.getActionMasked() == 0 && (view2 = (husVar = (hus) this.a).j) != null) {
                    view2.post(husVar.b);
                }
                return false;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((hva) this.a).i();
                return false;
            default:
                if (motionEvent.getActionMasked() == 1) {
                    ((hwg) this.a).e();
                }
                return true;
        }
    }
}
