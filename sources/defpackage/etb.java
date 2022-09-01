package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: etb  reason: default package */
/* loaded from: classes.dex */
public final class etb extends eun implements View.OnLayoutChangeListener {
    public final Set d = new HashSet();
    public int e = 0;
    private final int h;
    private final int i;
    private final int j;
    private final String k;
    private final di l;

    public etb(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f42800_resource_name_obfuscated_res_0x7f07070e);
        this.j = dimensionPixelSize;
        int max = Math.max(Math.round(gvv.f(context) / (resources.getDimension(R.dimen.f42840_resource_name_obfuscated_res_0x7f070712) + (dimensionPixelSize + dimensionPixelSize))), resources.getInteger(R.integer.f132830_resource_name_obfuscated_res_0x7f0c013d));
        this.h = max;
        this.i = max * resources.getInteger(R.integer.f132820_resource_name_obfuscated_res_0x7f0c013c);
        this.l = new eta(dimensionPixelSize);
        this.k = resources.getString(R.string.f176410_resource_name_obfuscated_res_0x7f140cd2);
    }

    @Override // defpackage.ls
    public final /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.f129870_resource_name_obfuscated_res_0x7f0b219a);
        recyclerView.ab(new GridLayoutManager(this.h, 1));
        recyclerView.ay(this.l);
        return new mo(inflate);
    }

    @Override // defpackage.ls
    public final void hb(RecyclerView recyclerView) {
        this.e = recyclerView.getMeasuredWidth();
        recyclerView.addOnLayoutChangeListener(this);
    }

    @Override // defpackage.ls
    public final void hc(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this);
    }

    @Override // defpackage.ls
    public final int he(int i) {
        return R.layout.f146740_resource_name_obfuscated_res_0x7f0e05e3;
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, final int i) {
        int i2 = 8;
        if (this.e == 0) {
            moVar.a.setVisibility(8);
            return;
        }
        moVar.a.setVisibility(0);
        String y = y(i);
        final euf x = x(i);
        final eum eumVar = (eum) this.g.get(i);
        ((AppCompatTextView) moVar.a.findViewById(R.id.f129830_resource_name_obfuscated_res_0x7f0b2196)).setText(y);
        RecyclerView recyclerView = (RecyclerView) moVar.a.findViewById(R.id.f129870_resource_name_obfuscated_res_0x7f0b219a);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.width = this.e;
        recyclerView.setLayoutParams(layoutParams);
        int paddingLeft = this.e - (recyclerView.getPaddingLeft() + recyclerView.getPaddingRight());
        int i3 = this.j;
        int max = Math.max(0, (paddingLeft / this.h) - (i3 + i3));
        if (max < 0) {
            ((ltd) euf.d.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingItemAdapter", "setItemWidth", 550, "ThemeListingItemAdapter.java")).u("Invalid width: %d", max);
        } else {
            x.k = max;
        }
        int i4 = this.d.contains(Integer.valueOf(i)) ? 10000 : this.i;
        x.E(i4);
        recyclerView.aa(x);
        final View findViewById = moVar.a.findViewById(R.id.f129820_resource_name_obfuscated_res_0x7f0b2195);
        if (i4 < x.y()) {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: esx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final etb etbVar = etb.this;
                final View view2 = findViewById;
                final int i5 = i;
                final euf eufVar = x;
                final eum eumVar2 = eumVar;
                view2.setOnClickListener(null);
                view.postDelayed(new Runnable() { // from class: esz
                    @Override // java.lang.Runnable
                    public final void run() {
                        etb etbVar2 = etb.this;
                        int i6 = i5;
                        View view3 = view2;
                        euf eufVar2 = eufVar;
                        eum eumVar3 = eumVar2;
                        etbVar2.d.add(Integer.valueOf(i6));
                        view3.setVisibility(8);
                        eufVar2.E(10000);
                        eumVar3.q(eufVar2);
                    }
                }, 200L);
            }
        });
        findViewById.setContentDescription(String.format(this.k, y(i)));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.post(new esy(this, i3, i, 0));
    }
}
