package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: oe  reason: default package */
/* loaded from: classes2.dex */
public final class oe implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static oe a;
    public static oe b;
    public final View c;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new od(this, 1);
    private final Runnable g = new od(this, 0);
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private kdr l;

    public oe(View view, CharSequence charSequence) {
        this.c = view;
        this.d = charSequence;
        this.e = aag.c(ViewConfiguration.get(view.getContext()));
        d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(oe oeVar) {
        oe oeVar2 = a;
        if (oeVar2 != null) {
            oeVar2.c.removeCallbacks(oeVar2.f);
        }
        a = oeVar;
        if (oeVar != null) {
            oeVar.c.postDelayed(oeVar.f, ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void d() {
        this.k = true;
    }

    public final void a() {
        if (b == this) {
            b = null;
            kdr kdrVar = this.l;
            if (kdrVar != null) {
                kdrVar.p();
                this.l = null;
                d();
                this.c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (a == this) {
            b(null);
        }
        this.c.removeCallbacks(this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        int height;
        int i;
        long longPressTimeout;
        long j;
        long j2;
        if (!aad.ag(this.c)) {
            return;
        }
        b(null);
        oe oeVar = b;
        if (oeVar != null) {
            oeVar.a();
        }
        b = this;
        this.j = z;
        kdr kdrVar = new kdr(this.c.getContext());
        this.l = kdrVar;
        View view = this.c;
        int i2 = this.h;
        int i3 = this.i;
        boolean z2 = this.j;
        CharSequence charSequence = this.d;
        if (kdrVar.q()) {
            kdrVar.p();
        }
        ((TextView) kdrVar.d).setText(charSequence);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) kdrVar.b;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = ((Context) kdrVar.e).getResources().getDimensionPixelOffset(R.dimen.f43020_resource_name_obfuscated_res_0x7f070724);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = ((Context) kdrVar.e).getResources().getDimensionPixelOffset(R.dimen.f43010_resource_name_obfuscated_res_0x7f070723);
            height = i3 + dimensionPixelOffset2;
            i = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = ((Context) kdrVar.e).getResources().getDimensionPixelOffset(z2 ? R.dimen.f43050_resource_name_obfuscated_res_0x7f070727 : R.dimen.f43040_resource_name_obfuscated_res_0x7f070726);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (!(context instanceof Activity)) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame((Rect) kdrVar.a);
            if (((Rect) kdrVar.a).left < 0 && ((Rect) kdrVar.a).top < 0) {
                Resources resources = ((Context) kdrVar.e).getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                ((Rect) kdrVar.a).set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen((int[]) kdrVar.g);
            view.getLocationOnScreen((int[]) kdrVar.c);
            int[] iArr = (int[]) kdrVar.c;
            int i4 = iArr[0];
            int[] iArr2 = (int[]) kdrVar.g;
            int i5 = i4 - iArr2[0];
            iArr[0] = i5;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i5 + i2) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ((View) kdrVar.f).measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = ((View) kdrVar.f).getMeasuredHeight();
            int i6 = ((int[]) kdrVar.c)[1];
            int i7 = ((i + i6) - dimensionPixelOffset3) - measuredHeight;
            int i8 = i6 + height + dimensionPixelOffset3;
            if (z2) {
                if (i7 >= 0) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i8;
                }
            } else if (measuredHeight + i8 <= ((Rect) kdrVar.a).height()) {
                layoutParams.y = i8;
            } else {
                layoutParams.y = i7;
            }
        }
        ((WindowManager) ((Context) kdrVar.e).getSystemService("window")).addView((View) kdrVar.f, (ViewGroup.LayoutParams) kdrVar.b);
        this.c.addOnAttachStateChangeListener(this);
        if (this.j) {
            j2 = 2500;
        } else {
            if ((aad.l(this.c) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        this.c.removeCallbacks(this.g);
        this.c.postDelayed(this.g, j2);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.l == null || !this.j) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.c.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    d();
                    a();
                }
            } else if (this.c.isEnabled() && this.l == null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (this.k || Math.abs(x - this.h) > this.e || Math.abs(y - this.i) > this.e) {
                    this.h = x;
                    this.i = y;
                    this.k = false;
                    b(this);
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
