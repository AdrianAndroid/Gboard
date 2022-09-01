package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: cu  reason: default package */
/* loaded from: classes.dex */
public class cu {
    public final cq a;
    private final int b;

    public cu(Context context) {
        this(context, cv.a(context, 0));
    }

    public final Context a() {
        return this.a.a;
    }

    public cv b() {
        int i;
        ListAdapter listAdapter;
        cv cvVar = new cv(this.a.a, this.b);
        cq cqVar = this.a;
        ct ctVar = cvVar.a;
        View view = cqVar.f;
        if (view != null) {
            ctVar.y = view;
        } else {
            CharSequence charSequence = cqVar.e;
            if (charSequence != null) {
                ctVar.a(charSequence);
            }
            Drawable drawable = cqVar.d;
            if (drawable != null) {
                ctVar.u = drawable;
                ctVar.t = 0;
                ImageView imageView = ctVar.v;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    ctVar.v.setImageDrawable(drawable);
                }
            }
            int i2 = cqVar.c;
            if (i2 != 0) {
                ctVar.u = null;
                ctVar.t = i2;
                ImageView imageView2 = ctVar.v;
                if (imageView2 != null) {
                    if (i2 != 0) {
                        imageView2.setVisibility(0);
                        ctVar.v.setImageResource(ctVar.t);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = cqVar.g;
        if (charSequence2 != null) {
            ctVar.e = charSequence2;
            TextView textView = ctVar.x;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = cqVar.h;
        if (charSequence3 != null) {
            ctVar.e(-1, charSequence3, cqVar.i);
        }
        CharSequence charSequence4 = cqVar.j;
        if (charSequence4 != null) {
            ctVar.e(-2, charSequence4, cqVar.k);
        }
        CharSequence charSequence5 = cqVar.l;
        if (charSequence5 != null) {
            ctVar.e(-3, charSequence5, cqVar.m);
        }
        if (cqVar.p != null || cqVar.q != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cqVar.b.inflate(ctVar.D, (ViewGroup) null);
            if (cqVar.v) {
                listAdapter = new cn(cqVar, cqVar.a, ctVar.E, cqVar.p, alertController$RecycleListView);
            } else {
                if (cqVar.w) {
                    i = ctVar.F;
                } else {
                    i = ctVar.G;
                }
                listAdapter = cqVar.q;
                if (listAdapter == null) {
                    listAdapter = new cs(cqVar.a, i, cqVar.p);
                }
            }
            ctVar.z = listAdapter;
            ctVar.A = cqVar.x;
            if (cqVar.r != null) {
                alertController$RecycleListView.setOnItemClickListener(new co(cqVar, ctVar));
            } else if (cqVar.y != null) {
                alertController$RecycleListView.setOnItemClickListener(new cp(cqVar, alertController$RecycleListView, ctVar));
            }
            if (cqVar.w) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (cqVar.v) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            ctVar.f = alertController$RecycleListView;
        }
        View view2 = cqVar.t;
        if (view2 != null) {
            ctVar.g = view2;
            ctVar.h = 0;
            ctVar.i = false;
        } else {
            int i3 = cqVar.s;
            if (i3 != 0) {
                ctVar.g = null;
                ctVar.h = i3;
                ctVar.i = false;
            }
        }
        cvVar.setCancelable(this.a.n);
        if (this.a.n) {
            cvVar.setCanceledOnTouchOutside(true);
        }
        cvVar.setOnCancelListener(null);
        cvVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = this.a.o;
        if (onKeyListener != null) {
            cvVar.setOnKeyListener(onKeyListener);
        }
        return cvVar;
    }

    public final void c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        cq cqVar = this.a;
        cqVar.q = listAdapter;
        cqVar.r = onClickListener;
    }

    public final void d(View view) {
        this.a.f = view;
    }

    public final void e(Drawable drawable) {
        this.a.d = drawable;
    }

    public final void f(int i) {
        cq cqVar = this.a;
        cqVar.g = cqVar.a.getText(i);
    }

    public final void g(CharSequence charSequence) {
        this.a.g = charSequence;
    }

    public final void h(int i, DialogInterface.OnClickListener onClickListener) {
        cq cqVar = this.a;
        cqVar.l = cqVar.a.getText(i);
        this.a.m = onClickListener;
    }

    public final void i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        cq cqVar = this.a;
        cqVar.h = charSequence;
        cqVar.i = onClickListener;
    }

    public final void j(int i) {
        cq cqVar = this.a;
        cqVar.e = cqVar.a.getText(i);
    }

    public final void k(CharSequence charSequence) {
        this.a.e = charSequence;
    }

    public final void l(int i, DialogInterface.OnClickListener onClickListener) {
        cq cqVar = this.a;
        cqVar.j = cqVar.a.getText(i);
        this.a.k = onClickListener;
    }

    public final void m(DialogInterface.OnKeyListener onKeyListener) {
        this.a.o = onKeyListener;
    }

    public final void n(int i, DialogInterface.OnClickListener onClickListener) {
        cq cqVar = this.a;
        cqVar.h = cqVar.a.getText(i);
        this.a.i = onClickListener;
    }

    public cu(Context context, int i) {
        this.a = new cq(new ContextThemeWrapper(context, cv.a(context, i)));
        this.b = i;
    }
}
