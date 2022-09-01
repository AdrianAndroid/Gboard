package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchView extends kx implements fn {
    static final nzv p;
    private final Intent A;
    private final CharSequence B;
    private CharSequence C;
    private boolean D;
    private int E;
    private boolean F;
    private int G;
    private final Runnable H;
    private Runnable I;
    private final View.OnClickListener J;
    private final TextView.OnEditorActionListener K;
    private final AdapterView.OnItemClickListener L;
    private final AdapterView.OnItemSelectedListener M;
    private TextWatcher N;
    public final SearchAutoComplete a;
    public final View b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView i;
    public final View j;
    public ne k;
    public boolean l;
    public boolean m;
    public CharSequence n;
    View.OnKeyListener o;
    private final View q;
    private final View r;
    private nh s;
    private Rect t;
    private Rect u;
    private int[] v;
    private int[] w;
    private final ImageView x;
    private final Drawable y;
    private final Intent z;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SearchAutoComplete extends hz {
        public SearchView a;
        public boolean b;
        final Runnable c;
        private int d;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public final void c(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.b = false;
                removeCallbacks(this.c);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.b = true;
            } else {
                this.b = false;
                removeCallbacks(this.c);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.d <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.hz, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.b) {
                removeCallbacks(this.c);
                post(this.c);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected final void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            setMinWidth((int) TypedValue.applyDimension(1, (i < 960 || configuration.screenHeightDp < 720 || configuration.orientation != 2) ? i < 600 ? 160 : 192 : 256, displayMetrics));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.a;
            searchView.t(searchView.m);
            searchView.i();
            if (searchView.a.hasFocus()) {
                searchView.c();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0) {
                    if (keyEvent.getAction() == 1) {
                        KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.handleUpEvent(keyEvent);
                        }
                        if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                            this.a.clearFocus();
                            c(false);
                            return true;
                        }
                    }
                    i = 4;
                } else {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.startTracking(keyEvent, this);
                    }
                    return true;
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (!z || !this.a.hasFocus() || getVisibility() != 0) {
                return;
            }
            this.b = true;
            if (!SearchView.u(getContext())) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                nd.b(this, 1);
                if (!enoughToFilter()) {
                    return;
                }
                showDropDown();
                return;
            }
            nzv nzvVar = SearchView.p;
            nzv.n();
            Object obj = nzvVar.a;
            if (obj == null) {
                return;
            }
            try {
                ((Method) obj).invoke(this, true);
            } catch (Exception unused) {
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected final void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void setThreshold(int i) {
            super.setThreshold(i);
            this.d = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.f7930_resource_name_obfuscated_res_0x7f040258);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.c = new az(this, 18);
            this.d = getThreshold();
        }
    }

    static {
        nzv nzvVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            nzvVar = new nzv(null, null, null);
        }
        p = nzvVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    static boolean u(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private final int x() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.f31970_resource_name_obfuscated_res_0x7f070036);
    }

    private final int y() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.f31980_resource_name_obfuscated_res_0x7f070037);
    }

    @Override // defpackage.fn
    public final void a() {
        this.a.setText("");
        SearchAutoComplete searchAutoComplete = this.a;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        clearFocus();
        t(true);
        this.a.setImeOptions(this.G);
        this.F = false;
    }

    @Override // defpackage.fn
    public final void b() {
        if (this.F) {
            return;
        }
        this.F = true;
        int imeOptions = this.a.getImeOptions();
        this.G = imeOptions;
        this.a.setImeOptions(imeOptions | 33554432);
        this.a.setText("");
        g();
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            nd.a(this.a);
            return;
        }
        nzv nzvVar = p;
        SearchAutoComplete searchAutoComplete = this.a;
        nzv.n();
        Object obj = nzvVar.b;
        if (obj != null) {
            try {
                ((Method) obj).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        nzv nzvVar2 = p;
        SearchAutoComplete searchAutoComplete2 = this.a;
        nzv.n();
        Object obj2 = nzvVar2.c;
        if (obj2 == null) {
            return;
        }
        try {
            ((Method) obj2).invoke(searchAutoComplete2, new Object[0]);
        } catch (Exception unused2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.D = true;
        super.clearFocus();
        this.a.clearFocus();
        this.a.c(false);
        this.D = false;
    }

    public final void g() {
        t(false);
        this.a.requestFocus();
        this.a.c(true);
    }

    public final void h() {
        Editable text = this.a.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        ne neVar = this.k;
        if (neVar != null) {
            text.toString();
            ((dne) neVar).aB();
        }
        this.a.c(false);
        this.a.dismissDropDown();
    }

    public final void i() {
        post(this.H);
    }

    public final void j(int i) {
        this.a.setImeOptions(i);
    }

    public final void k(int i) {
        this.E = i;
        requestLayout();
    }

    public final void l() {
        boolean z = !TextUtils.isEmpty(this.a.getText());
        int i = 0;
        boolean z2 = z || (this.l && !this.F);
        ImageView imageView = this.e;
        if (true != z2) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.e.getDrawable();
        if (drawable != null) {
            drawable.setState(z ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    public final void m() {
        int[] iArr = this.a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.r.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void n() {
        this.r.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.H);
        post(this.I);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.kx, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.a;
            Rect rect = this.t;
            searchAutoComplete.getLocationInWindow(this.v);
            getLocationInWindow(this.w);
            int[] iArr = this.v;
            int i5 = iArr[1];
            int[] iArr2 = this.w;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            this.u.set(this.t.left, 0, this.t.right, i4 - i2);
            nh nhVar = this.s;
            if (nhVar == null) {
                nh nhVar2 = new nh(this.u, this.t, this.a);
                this.s = nhVar2;
                setTouchDelegate(nhVar2);
                return;
            }
            nhVar.a(this.u, this.t);
        }
    }

    @Override // defpackage.kx, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        if (this.m) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.E;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(y(), size);
        } else if (mode == 0) {
            size = this.E;
            if (size <= 0) {
                size = y();
            }
        } else if (mode == 1073741824 && (i3 = this.E) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(x(), size2);
        } else if (mode2 == 0) {
            size2 = x();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ng)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ng ngVar = (ng) parcelable;
        super.onRestoreInstanceState(ngVar.d);
        t(ngVar.a);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        ng ngVar = new ng(super.onSaveInstanceState());
        ngVar.a = this.m;
        return ngVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!this.D && isFocusable()) {
            if (!this.m) {
                boolean requestFocus = this.a.requestFocus(i, rect);
                if (requestFocus) {
                    t(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i, rect);
        }
        return false;
    }

    public final void t(boolean z) {
        this.m = z;
        int i = 0;
        int i2 = true != z ? 8 : 0;
        TextUtils.isEmpty(this.a.getText());
        this.c.setVisibility(i2);
        v();
        this.q.setVisibility(true != z ? 0 : 8);
        if (this.x.getDrawable() == null || this.l) {
            i = 8;
        }
        this.x.setVisibility(i);
        l();
        w();
        n();
    }

    public final void v() {
        this.d.setVisibility(8);
    }

    public final void w() {
        this.i.setVisibility(8);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f16510_resource_name_obfuscated_res_0x7f040670);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new Rect();
        this.u = new Rect();
        this.v = new int[2];
        this.w = new int[2];
        this.H = new az(this, 17);
        this.I = new bsd(1);
        new WeakHashMap();
        hk hkVar = new hk(this, 2);
        this.J = hkVar;
        this.o = new na();
        een eenVar = new een(this, 1);
        this.K = eenVar;
        nb nbVar = new nb();
        this.L = nbVar;
        nc ncVar = new nc(this, 0);
        this.M = ncVar;
        this.N = new my(this);
        gkn w = gkn.w(context, attributeSet, ei.u, i, 0);
        aad.L(this, context, ei.u, attributeSet, (TypedArray) w.a, i, 0);
        LayoutInflater.from(context).inflate(w.l(9, R.layout.f133410_resource_name_obfuscated_res_0x7f0e0019), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.a = searchAutoComplete;
        searchAutoComplete.a = this;
        this.q = findViewById(R.id.f68050_resource_name_obfuscated_res_0x7f0b08b7);
        View findViewById = findViewById(R.id.f68150_resource_name_obfuscated_res_0x7f0b08c1);
        this.b = findViewById;
        View findViewById2 = findViewById(R.id.f129220_resource_name_obfuscated_res_0x7f0b2141);
        this.r = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.f68000_resource_name_obfuscated_res_0x7f0b08b2);
        this.c = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.f68060_resource_name_obfuscated_res_0x7f0b08b8);
        this.d = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.f68040_resource_name_obfuscated_res_0x7f0b08b6);
        this.e = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.f68190_resource_name_obfuscated_res_0x7f0b08cc);
        this.i = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.f68140_resource_name_obfuscated_res_0x7f0b08c0);
        this.x = imageView5;
        aad.O(findViewById, w.n(10));
        aad.O(findViewById2, w.n(14));
        imageView.setImageDrawable(w.n(13));
        imageView2.setImageDrawable(w.n(7));
        imageView3.setImageDrawable(w.n(4));
        imageView4.setImageDrawable(w.n(16));
        imageView5.setImageDrawable(w.n(13));
        this.y = w.n(12);
        ez.d(imageView, getResources().getString(R.string.f147740_resource_name_obfuscated_res_0x7f14001f));
        w.l(15, R.layout.f133400_resource_name_obfuscated_res_0x7f0e0018);
        w.l(5, 0);
        imageView.setOnClickListener(hkVar);
        imageView3.setOnClickListener(hkVar);
        imageView2.setOnClickListener(hkVar);
        imageView4.setOnClickListener(hkVar);
        searchAutoComplete.setOnClickListener(hkVar);
        searchAutoComplete.addTextChangedListener(this.N);
        searchAutoComplete.setOnEditorActionListener(eenVar);
        searchAutoComplete.setOnItemClickListener(nbVar);
        searchAutoComplete.setOnItemSelectedListener(ncVar);
        searchAutoComplete.setOnKeyListener(this.o);
        searchAutoComplete.setOnFocusChangeListener(new mz());
        boolean s = w.s(8, true);
        if (this.l != s) {
            this.l = s;
            t(s);
            z();
        }
        int h = w.h(1, -1);
        if (h != -1) {
            k(h);
        }
        this.B = w.p(6);
        this.C = w.p(11);
        int i2 = w.i(3, -1);
        if (i2 != -1) {
            j(i2);
        }
        int i3 = w.i(2, -1);
        if (i3 != -1) {
            searchAutoComplete.setInputType(i3);
        }
        setFocusable(w.s(0, true));
        w.r();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.z = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.A = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.j = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new dkr(this, 1));
        }
        t(this.l);
        z();
    }

    private final void z() {
        SpannableStringBuilder spannableStringBuilder = this.C;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = this.B;
        }
        SearchAutoComplete searchAutoComplete = this.a;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        if (this.l && this.y != null) {
            double textSize = searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            int i = (int) (textSize * 1.25d);
            this.y.setBounds(0, 0, i, i);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("   ");
            spannableStringBuilder2.setSpan(new ImageSpan(this.y), 1, 2, 33);
            spannableStringBuilder2.append(spannableStringBuilder);
            spannableStringBuilder = spannableStringBuilder2;
        }
        searchAutoComplete.setHint(spannableStringBuilder);
    }
}
