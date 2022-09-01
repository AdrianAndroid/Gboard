package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ct  reason: default package */
/* loaded from: classes.dex */
public final class ct {
    public final int B;
    public final int C;
    final int D;
    final int E;
    final int F;
    final int G;
    public final boolean H;
    public final Handler I;
    public final Context a;
    public final dt b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    ListView f;
    public View g;
    public int h;
    public Button j;
    public CharSequence k;
    public Message l;
    public Button m;
    public CharSequence n;
    public Message o;
    public Button p;
    public CharSequence q;
    public Message r;
    NestedScrollView s;
    public Drawable u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public View y;
    ListAdapter z;
    public boolean i = false;
    public int t = 0;
    int A = -1;
    public final View.OnClickListener J = new hk(this, 1);

    public ct(Context context, dt dtVar, Window window) {
        this.a = context;
        this.b = dtVar;
        this.c = window;
        this.I = new cr(dtVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ei.e, R.attr.f7720_resource_name_obfuscated_res_0x7f04023c, 0);
        this.B = obtainStyledAttributes.getResourceId(0, 0);
        this.C = obtainStyledAttributes.getResourceId(2, 0);
        this.D = obtainStyledAttributes.getResourceId(4, 0);
        this.E = obtainStyledAttributes.getResourceId(5, 0);
        this.F = obtainStyledAttributes.getResourceId(7, 0);
        this.G = obtainStyledAttributes.getResourceId(3, 0);
        this.H = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dtVar.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static final void c(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static final ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.I.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.q = charSequence;
            this.r = obtainMessage;
        } else if (i != -2) {
            this.k = charSequence;
            this.l = obtainMessage;
        } else {
            this.n = charSequence;
            this.o = obtainMessage;
        }
    }
}
