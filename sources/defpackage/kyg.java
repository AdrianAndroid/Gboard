package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* renamed from: kyg  reason: default package */
/* loaded from: classes.dex */
public final class kyg extends kye {
    private static final int[] n = {R.attr.f16890_resource_name_obfuscated_res_0x7f04069f, R.attr.f16910_resource_name_obfuscated_res_0x7f0406a1};
    private final AccessibilityManager o;

    private kyg(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.o = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static kyg l(View view) {
        ViewGroup viewGroup;
        CharSequence text = view.getResources().getText(R.string.f148290_resource_name_obfuscated_res_0x7f14008c);
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() != 16908290) {
                        viewGroup2 = (ViewGroup) view;
                    } else {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        int i = R.layout.f133940_resource_name_obfuscated_res_0x7f0e0063;
        if (resourceId != -1 && resourceId2 != -1) {
            i = R.layout.f143570_resource_name_obfuscated_res_0x7f0e0473;
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i, viewGroup, false);
        kyg kygVar = new kyg(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) kygVar.e.getChildAt(0)).a.setText(text);
        return kygVar;
    }

    @Override // defpackage.kye
    public final int a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.o.getRecommendedTimeoutMillis(0, 3);
        }
        return 0;
    }
}
