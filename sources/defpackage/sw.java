package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: sw  reason: default package */
/* loaded from: classes2.dex */
public class sw extends View {
    public int d;
    protected final Context e;
    public String f;
    public sd h;
    public int[] c = new int[32];
    public final HashMap g = new HashMap();

    public sw(Context context) {
        super(context);
        this.e = context;
        c();
    }

    private final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.d;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 + 1 > length) {
            this.c = Arrays.copyOf(iArr, length + length);
        }
        int[] iArr2 = this.c;
        int i3 = this.d;
        iArr2[i3] = i;
        this.d = i3 + 1;
    }

    public void a(rz rzVar, boolean z) {
    }

    protected void c() {
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || (resources = this.e.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final void e(int[] iArr) {
        this.f = null;
        this.d = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    public final void f() {
        if (this.h == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof sy)) {
            return;
        }
        ((sy) layoutParams).ar = this.h;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null) {
            b(i);
        }
    }
}
