package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.SearchView;
import android.view.View;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dkr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dkr implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dkr(SearchView searchView, int i) {
        this.b = i;
        this.a = searchView;
    }

    public /* synthetic */ dkr(View view, int i) {
        this.b = i;
        this.a = view;
    }

    public dkr(View view, int i, byte[] bArr) {
        this.b = i;
        this.a = view;
    }

    public /* synthetic */ dkr(dkv dkvVar, int i) {
        this.b = i;
        this.a = dkvVar;
    }

    public /* synthetic */ dkr(dlg dlgVar, int i) {
        this.b = i;
        this.a = dlgVar;
    }

    public /* synthetic */ dkr(dyi dyiVar, int i) {
        this.b = i;
        this.a = dyiVar;
    }

    public /* synthetic */ dkr(ede edeVar, int i) {
        this.b = i;
        this.a = edeVar;
    }

    public /* synthetic */ dkr(epr eprVar, int i) {
        this.b = i;
        this.a = eprVar;
    }

    public dkr(gsh gshVar, int i) {
        this.b = i;
        this.a = gshVar;
    }

    public dkr(gte gteVar, int i) {
        this.b = i;
        this.a = gteVar;
    }

    public dkr(hoe hoeVar, int i) {
        this.b = i;
        this.a = hoeVar;
    }

    public dkr(hus husVar, int i) {
        this.b = i;
        this.a = husVar;
    }

    public dkr(hwg hwgVar, int i) {
        this.b = i;
        this.a = hwgVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10 = 0;
        switch (this.b) {
            case 0:
                ((dkv) this.a).d(i3 - i);
                return;
            case 1:
                Object obj = this.a;
                SearchView searchView = (SearchView) obj;
                if (searchView.j.getWidth() <= 1) {
                    return;
                }
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.b.getPaddingLeft();
                Rect rect = new Rect();
                boolean b = oi.b((View) obj);
                if (searchView.l) {
                    i10 = resources.getDimensionPixelSize(R.dimen.f31840_resource_name_obfuscated_res_0x7f070029) + resources.getDimensionPixelSize(R.dimen.f31850_resource_name_obfuscated_res_0x7f07002a);
                }
                searchView.a.getDropDownBackground().getPadding(rect);
                if (b) {
                    i9 = -rect.left;
                } else {
                    i9 = paddingLeft - (rect.left + i10);
                }
                searchView.a.setDropDownHorizontalOffset(i9);
                int width = searchView.j.getWidth();
                int i11 = rect.left;
                searchView.a.setDropDownWidth((((width + i11) + rect.right) + i10) - paddingLeft);
                return;
            case 2:
                Object obj2 = this.a;
                if (i7 - i5 == i3 - i) {
                    return;
                }
                dlg dlgVar = (dlg) obj2;
                if (dlgVar.e == null) {
                    return;
                }
                gyc.b.execute(new dgd(dlgVar, 7));
                return;
            case 3:
                Object obj3 = this.a;
                if (obj3 == null) {
                    return;
                }
                Rect rect2 = new Rect();
                View view2 = (View) obj3;
                view2.getDrawingRect(rect2);
                view2.requestRectangleOnScreen(rect2, true);
                return;
            case 4:
                ((dyi) this.a).b(view);
                return;
            case 5:
                Object obj4 = this.a;
                if (i3 - i == i7 - i5) {
                    return;
                }
                BindingRecyclerView bindingRecyclerView = ((ede) obj4).c;
                Objects.requireNonNull(bindingRecyclerView);
                bindingRecyclerView.post(new eas(bindingRecyclerView, 9));
                return;
            case 6:
                ((epr) this.a).c();
                return;
            case 7:
                if (i3 <= i || i4 <= i2) {
                    return;
                }
                view.removeOnLayoutChangeListener(this);
                ((gsh) this.a).e(0);
                return;
            case 8:
                if (((gte) this.a).a.containsKey(view)) {
                    view.setTranslationX((i5 - i) + view.getTranslationX());
                    view.setTranslationY((i6 - i2) + view.getTranslationY());
                }
                view.removeOnLayoutChangeListener(this);
                return;
            case 9:
                hoe hoeVar = (hoe) this.a;
                View view3 = hoeVar.s;
                if (view3 == null || hoeVar.w == null) {
                    return;
                }
                int[] iArr = hoeVar.i;
                int i12 = iArr[0];
                view3.getLocationOnScreen(iArr);
                hoe hoeVar2 = (hoe) this.a;
                if (i12 == hoeVar2.i[0]) {
                    return;
                }
                hoeVar2.s();
                return;
            case 10:
                hus husVar = (hus) this.a;
                View view4 = husVar.k;
                if (view != view4 || view4 == null) {
                    return;
                }
                view4.post(husVar.a);
                return;
            case 11:
                hwg hwgVar = (hwg) this.a;
                View view5 = hwgVar.i;
                if (view != view5) {
                    return;
                }
                view5.post(hwgVar.D);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                hwg hwgVar2 = (hwg) this.a;
                View view6 = hwgVar2.a;
                if (view != view6) {
                    return;
                }
                view6.post(hwgVar2.H);
                return;
            default:
                ((View) this.a).getVisibility();
                return;
        }
    }
}
