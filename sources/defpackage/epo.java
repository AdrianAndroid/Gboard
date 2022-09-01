package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: epo  reason: default package */
/* loaded from: classes.dex */
public final class epo implements SeekBar.OnSeekBarChangeListener, epu {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderBrightnessPage");
    public final Context b;
    public final ImageView c;
    private final Context d;
    private final epw e;
    private final SeekBar f;
    private final AppCompatTextView g;
    private final View h;
    private final View i;
    private final ImageView j;
    private final int k;

    public epo(View view, Context context, eps epsVar, epw epwVar, int i) {
        Context context2 = view.getContext();
        this.b = context2;
        this.d = context;
        this.e = epwVar;
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.f129580_resource_name_obfuscated_res_0x7f0b217d);
        this.f = seekBar;
        this.g = (AppCompatTextView) view.findViewById(R.id.f129600_resource_name_obfuscated_res_0x7f0b217f);
        ImageView imageView = (ImageView) view.findViewById(R.id.f129630_resource_name_obfuscated_res_0x7f0b2182);
        this.c = imageView;
        View findViewById = view.findViewById(R.id.f129640_resource_name_obfuscated_res_0x7f0b2183);
        this.h = findViewById;
        View findViewById2 = view.findViewById(R.id.f129620_resource_name_obfuscated_res_0x7f0b2181);
        this.i = findViewById2;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.f129610_resource_name_obfuscated_res_0x7f0b2180);
        this.j = imageView2;
        int integer = (context2.getResources().getDisplayMetrics().widthPixels * context.getResources().getInteger(R.integer.f131850_resource_name_obfuscated_res_0x7f0c007f)) / 100;
        this.k = integer;
        seekBar.setOnSeekBarChangeListener(this);
        Button button = (Button) view.findViewById(R.id.f129650_resource_name_obfuscated_res_0x7f0b2184);
        button.setOnClickListener(new edc(epsVar, 16));
        View findViewById3 = view.findViewById(R.id.f129590_resource_name_obfuscated_res_0x7f0b217e);
        ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
        layoutParams.width = integer;
        findViewById3.setLayoutParams(layoutParams);
        int b = gvv.b(context);
        float f = integer / b;
        int f2 = (int) (dds.f(context, dds.a) * f);
        int f3 = (int) (dds.f(context, new ice[]{ice.HEADER}) * f);
        b(imageView2, integer, f2);
        b(imageView, integer, f2);
        b(findViewById, integer, f3);
        b(findViewById2, integer, f2 - f3);
        kcu.U(hrx.y(context2).b(), new epn(this, new eqg(context2.getString(R.string.f148240_resource_name_obfuscated_res_0x7f14006a)), integer / gvv.f(context), new dlm() { // from class: epm
            @Override // defpackage.dlm
            public final void b(String str, Drawable drawable) {
                epo.this.c.setImageDrawable(drawable);
            }
        }), gyc.b);
        if (i == 2) {
            button.setText(R.string.f176270_resource_name_obfuscated_res_0x7f140cc2);
        }
    }

    private static void b(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    @Override // defpackage.epu
    public final void a() {
        SeekBar seekBar = this.f;
        seekBar.setProgress((int) (this.e.e * seekBar.getMax()));
        epw epwVar = this.e;
        ImageView imageView = this.j;
        Rect rect = epwVar.a;
        Matrix matrix = new Matrix();
        float width = imageView.getWidth() / rect.width();
        matrix.setTranslate(-rect.left, (imageView.getHeight() / width) - rect.bottom);
        matrix.postScale(width, width);
        imageView.setImageBitmap(epwVar.d());
        imageView.setImageMatrix(matrix);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float progress = seekBar.getProgress() / seekBar.getMax();
        this.e.i(progress);
        this.g.setText(String.format(this.b.getString(R.string.f176190_resource_name_obfuscated_res_0x7f140cba), Integer.valueOf((int) (progress * 100.0f))));
        this.i.setAlpha(1.0f - this.e.e);
        this.h.setAlpha(1.0f - this.e.b());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
