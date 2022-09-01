package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.EditTextOnKeyboard;

/* compiled from: PG */
/* renamed from: bud  reason: default package */
/* loaded from: classes.dex */
public final class bud extends imo implements View.OnLayoutChangeListener {
    public int a;
    public final buc b;
    public EditTextOnKeyboard c;
    private irm d;
    private View e;
    private View f;
    private View g;
    private View h;
    private final int[] i = new int[2];
    private int j;
    private hpu p;

    public bud(Context context, imn imnVar, buc bucVar) {
        super(context, imnVar);
        this.b = bucVar;
    }

    public static Point c(View view) {
        int[] iArr = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    private final int o() {
        hsk hskVar = ((bvt) this.b).f.a;
        return (hskVar != null ? hskVar.U() : new hsn(0)).d();
    }

    private final void p(View view) {
        Point point = new Point(gvv.f(this.k), gvv.d(this.k));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Point c = c(view);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() + rect.top;
        if (height > 0) {
            point.y = height;
        }
        int o = o();
        int max = Math.max((point.y - iArr[1]) + o, 0);
        int max2 = Math.max(iArr[0] - c.x, 0);
        int max3 = Math.max((point.x - max2) - view.getWidth(), 0);
        int max4 = Math.max(max - view.getHeight(), 0);
        if (max4 == o) {
            max4 = 0;
        }
        View view2 = this.e;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = Math.min(this.j, max);
            this.e.setLayoutParams(layoutParams);
        }
        View view3 = this.f;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            layoutParams2.width = max2;
            this.f.setLayoutParams(layoutParams2);
        }
        View view4 = this.g;
        if (view4 != null) {
            ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
            layoutParams3.width = max3;
            this.g.setLayoutParams(layoutParams3);
        }
        View view5 = this.h;
        if (view5 != null) {
            ViewGroup.LayoutParams layoutParams4 = view5.getLayoutParams();
            layoutParams4.height = max4;
            this.h.setLayoutParams(layoutParams4);
        }
        int[] iArr2 = this.i;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
    }

    @Override // defpackage.imo
    public final int a() {
        return R.string.f147880_resource_name_obfuscated_res_0x7f14003f;
    }

    @Override // defpackage.imo
    protected final View b(View view) {
        ViewGroup viewGroup = (ViewGroup) this.m.b(hqs.d(this.k), R.layout.f133490_resource_name_obfuscated_res_0x7f0e0026);
        viewGroup.setEnabled(true);
        bph bphVar = new bph(this, 4);
        View findViewById = viewGroup.findViewById(R.id.f52240_resource_name_obfuscated_res_0x7f0b0067);
        findViewById.setOnTouchListener(bphVar);
        this.e = viewGroup.findViewById(R.id.f52260_resource_name_obfuscated_res_0x7f0b0069);
        this.f = viewGroup.findViewById(R.id.f52290_resource_name_obfuscated_res_0x7f0b006c);
        this.g = viewGroup.findViewById(R.id.f52280_resource_name_obfuscated_res_0x7f0b006b);
        this.h = viewGroup.findViewById(R.id.f52270_resource_name_obfuscated_res_0x7f0b006a);
        View view2 = this.f;
        if (view2 != null) {
            view2.setOnTouchListener(bphVar);
            this.f.setOnHoverListener(btz.b);
        }
        View view3 = this.g;
        if (view3 != null) {
            view3.setOnTouchListener(bphVar);
            this.g.setOnHoverListener(btz.a);
        }
        View view4 = this.h;
        if (view4 != null) {
            view4.setOnTouchListener(bphVar);
            this.h.setOnHoverListener(btz.c);
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.j = ((gvv.d(this.k) - c(view).y) - findViewById.getMinimumHeight()) + o();
        int[] iArr2 = this.i;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        viewGroup.findViewById(R.id.f52230_resource_name_obfuscated_res_0x7f0b0066).setClickable(true);
        Button button = (Button) viewGroup.findViewById(R.id.f52220_resource_name_obfuscated_res_0x7f0b0065);
        Button button2 = (Button) viewGroup.findViewById(R.id.f52210_resource_name_obfuscated_res_0x7f0b0064);
        EditTextOnKeyboard editTextOnKeyboard = (EditTextOnKeyboard) viewGroup.findViewById(R.id.f52250_resource_name_obfuscated_res_0x7f0b0068);
        this.c = editTextOnKeyboard;
        if (editTextOnKeyboard != null) {
            editTextOnKeyboard.setActivated(true);
            EditorInfo a = this.c.a();
            if (a != null) {
                a.fieldName = "clipboard";
                a.imeOptions |= 1073741824;
            }
            button.setOnClickListener(new hk(this, 11));
        }
        button2.setOnClickListener(new hk(this, 12));
        return viewGroup;
    }

    @Override // defpackage.imo
    public final void d(View view) {
        hpu hpuVar;
        super.d(view);
        buc bucVar = this.b;
        EditTextOnKeyboard editTextOnKeyboard = this.c;
        if (editTextOnKeyboard == null) {
            hpuVar = null;
        } else {
            if (this.p == null) {
                this.p = new bua(this, editTextOnKeyboard);
            }
            hpuVar = this.p;
        }
        bvt bvtVar = (bvt) bucVar;
        hsk hskVar = bvtVar.f.a;
        if (hskVar != null) {
            hskVar.av();
        }
        if (hpuVar != null) {
            bvtVar.f.br(hpuVar, false);
        }
    }

    public final void f(boolean z) {
        m();
        this.b.f(z);
    }

    public final void g() {
        m();
        this.b.f(true);
        bvt bvtVar = (bvt) this.b;
        bvtVar.f.at(hfd.d(new iay(-10104, null, new icz(bvtVar.a.getString(R.string.f154920_resource_name_obfuscated_res_0x7f14039e), llw.l("activation_source", hfl.AUTOMATIC)))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.imo
    public final void h(View view) {
        View view2 = this.o;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this);
        }
        irm irmVar = this.d;
        if (irmVar != null) {
            irmVar.h();
            this.d = null;
        }
        super.h(view);
    }

    @Override // defpackage.imo
    protected final void i(View view, View view2) {
        p(view2);
        view2.addOnLayoutChangeListener(this);
        Configuration c = irn.c();
        this.a = c == null ? 1 : c.orientation;
        irm irmVar = this.d;
        if (irmVar != null) {
            irmVar.h();
        }
        bub bubVar = new bub(this);
        this.d = bubVar;
        bubVar.f(mjl.a);
        this.m.e(view, view2, 1024, 0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return this.n != null;
    }

    @Override // defpackage.imo
    protected final boolean k() {
        return false;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.o;
        if (view2 == null) {
            return;
        }
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i9 = iArr[0];
        int[] iArr2 = this.i;
        if (i9 == iArr2[0] && iArr[1] == iArr2[1]) {
            return;
        }
        p(this.o);
        View view3 = this.e;
        if (view3 == null) {
            return;
        }
        view3.invalidate();
    }
}
