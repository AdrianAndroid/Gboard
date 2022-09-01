package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.picker.CircleView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: hcn  reason: default package */
/* loaded from: classes.dex */
public final class hcn extends FrameLayout {
    private static final lmz f = lmz.w("🤝", "👭", "👬", "👫", "🧑\u200d🤝\u200d🧑", "💏", "👩\u200d❤️\u200d💋\u200d👨", "👨\u200d❤️\u200d💋\u200d👨", "👩\u200d❤️\u200d💋\u200d👩", "💑", "👩\u200d❤️\u200d👨", "👨\u200d❤️\u200d👨", "👩\u200d❤️\u200d👩");
    private static final lmz g = lmz.r("👪");
    private static final int[][] h = {new int[]{0, 0, -5, -4, -3, -2, -1}, new int[]{0, -5, 2, 3, 4, 5, 6}, new int[]{0, -4, 7, 8, 9, 10, 11}, new int[]{0, -3, 12, 13, 14, 15, 16}, new int[]{0, -2, 17, 18, 19, 20, 21}, new int[]{1, -1, 22, 23, 24, 25, 26}};
    private static final int[][] i = {new int[]{0, 2, 3, 4, 5, 6}, new int[]{0, 7, 8, 9, 10, 11}, new int[]{0, 12, 13, 14, 15, 16}, new int[]{0, 17, 18, 19, 20, 21}, new int[]{1, 22, 23, 24, 25, 26}};
    private static final int[] j = {R.color.f27320_resource_name_obfuscated_res_0x7f06053e, R.color.f30050_resource_name_obfuscated_res_0x7f0606f6, R.color.f30060_resource_name_obfuscated_res_0x7f0606f7, R.color.f30040_resource_name_obfuscated_res_0x7f0606f5, R.color.f21440_resource_name_obfuscated_res_0x7f0600f0};
    public final AtomicReference a = new AtomicReference();
    public FrameLayout b;
    public LinearLayout c;
    public int d;
    public int e;
    private final hei k;
    private View.OnClickListener l;
    private int m;
    private String[] n;
    private int o;

    /* JADX WARN: Removed duplicated region for block: B:9:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hcn(android.content.Context r7, java.lang.String[] r8, android.view.View.OnClickListener r9, int r10, int r11, float r12, defpackage.hei r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcn.<init>(android.content.Context, java.lang.String[], android.view.View$OnClickListener, int, int, float, hei):void");
    }

    private final void b(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.o;
        layoutParams.height = this.e;
        view.setLayoutParams(layoutParams);
    }

    private final void c(int i2, int i3, int[][] iArr, LinearLayout linearLayout) {
        Context context = getContext();
        int i4 = iArr[i2][i3];
        if (i4 == 0) {
            inflate(context, R.layout.f134130_resource_name_obfuscated_res_0x7f0e007e, linearLayout);
            EmojiView emojiView = (EmojiView) linearLayout.getChildAt(i3);
            b(emojiView);
            emojiView.setVisibility(4);
        } else if (i4 > 0) {
            inflate(context, R.layout.f134130_resource_name_obfuscated_res_0x7f0e007e, linearLayout);
            EmojiView emojiView2 = (EmojiView) linearLayout.getChildAt(i3);
            b(emojiView2);
            d(emojiView2, this.n[iArr[i2][i3] - 1]);
        } else {
            inflate(context, R.layout.f134110_resource_name_obfuscated_res_0x7f0e007c, linearLayout);
            CircleView circleView = (CircleView) linearLayout.getChildAt(i3);
            if (Build.VERSION.SDK_INT >= 29) {
                circleView.setForceDarkAllowed(false);
            }
            Paint paint = new Paint();
            paint.setColor(us.a(context, j[iArr[i2][i3] + 5]));
            paint.setStyle(Paint.Style.FILL);
            circleView.a = paint;
            b(circleView);
        }
    }

    private final void d(EmojiView emojiView, String str) {
        emojiView.setClickable(true);
        hei heiVar = this.k;
        emojiView.d(hei.c(str, heiVar.c, heiVar.d, heiVar.e, llp.q(), true));
        emojiView.setOnClickListener(this.l);
        if (this.a.get() == null) {
            this.a.set(emojiView);
        }
    }

    private static void e(View view, float f2) {
        view.setPaddingRelative((int) (view.getPaddingStart() * f2), (int) (view.getPaddingTop() * f2), (int) (view.getPaddingEnd() * f2), (int) (view.getPaddingBottom() * f2));
    }

    public final int a() {
        return (this.m * this.o) + this.c.getPaddingStart() + this.c.getPaddingEnd() + this.b.getPaddingStart() + this.b.getPaddingEnd();
    }
}
