/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.options.elements;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.enums.PointStyle;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Point {
	
	/**
	 * @see #setRadius(BigDecimal)
	 */
	private BigDecimal radius;

	/**
	 * @see #setPointStyle(PointStyle)
	 */
	private PointStyle pointStyle;

	/**
	 * @see #setBackgroundColor(Color)
	 */
	private Color backgroundColor;

	/**
	 * @see #setBorderWidth(BigDecimal)
	 */
	private BigDecimal borderWidth;

	/**
	 * @see #setBorderColor(Color)
	 */
	private Color borderColor;

	/**
	 * @see #setHitRadius(BigDecimal)
	 */
	private BigDecimal hitRadius;

	/**
	 * @see #setHoverRadius(BigDecimal)
	 */
	private BigDecimal hoverRadius;

	/**
	 * @see #setHoverBorderWidth(BigDecimal)
	 */
	private BigDecimal hoverBorderWidth;

	/**
	 * @see #setRadius(BigDecimal)
	 */
	public BigDecimal getRadius() {
	    return this.radius;
	}

	/**
	 * <p>
	 * Default point radius
	 * </p>
	 * 
	 * <p>
	 * Default {@code 3}
	 * </p>
	 */
	public void setRadius(BigDecimal radius) {
	    this.radius = radius;
	}

	/**
	 * @see #setPointStyle(PointStyle)
	 */
	public PointStyle getPointStyle() {
	    return this.pointStyle;
	}

	/**
	 * <p>
	 * Default point style
	 * </p>
	 * 
	 * <p>
	 * Default {@code 'circle'}
	 * </p>
	 */
	public void setPointStyle(PointStyle pointStyle) {
	    this.pointStyle = pointStyle;
	}

	/**
	 * @see #setBackgroundColor(Color)
	 */
	public Color getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * <p>
	 * Default point fill color
	 * </p>
	 * 
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * </p>
	 */
	public void setBackgroundColor(Color backgroundColor) {
	    this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setBorderWidth(BigDecimal)
	 */
	public BigDecimal getBorderWidth() {
	    return this.borderWidth;
	}

	/**
	 * <p>
	 * Default point stroke width
	 * </p>
	 * 
	 * <p>
	 * Default {@code 1}
	 * </p>
	 */
	public void setBorderWidth(BigDecimal borderWidth) {
	    this.borderWidth = borderWidth;
	}

	/**
	 * @see #setBorderColor(Color)
	 */
	public Color getBorderColor() {
	    return this.borderColor;
	}

	/**
	 * <p>
	 * Default point stroke color
	 * </p>
	 * 
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * </p>
	 */
	public void setBorderColor(Color borderColor) {
	    this.borderColor = borderColor;
	}

	/**
	 * @see #setHitRadius(BigDecimal)
	 */
	public BigDecimal getHitRadius() {
	    return this.hitRadius;
	}

	/**
	 * <p>
	 * Extra radius added to point radius for hit detection
	 * </p>
	 * 
	 * <p>
	 * Default {@code 1}
	 * </p>
	 */
	public void setHitRadius(BigDecimal hitRadius) {
	    this.hitRadius = hitRadius;
	}

	/**
	 * @see #setHoverRadius(BigDecimal)
	 */
	public BigDecimal getHoverRadius() {
	    return this.hoverRadius;
	}

	/**
	 * <p>
	 * Default point radius when hovered
	 * </p>
	 * 
	 * <p>
	 * Default {@code 4}
	 * </p>
	 */
	public void setHoverRadius(BigDecimal hoverRadius) {
	    this.hoverRadius = hoverRadius;
	}

	/**
	 * @see #setHoverBorderWidth(BigDecimal)
	 */
	public BigDecimal getHoverBorderWidth() {
	    return this.hoverBorderWidth;
	}

	/**
	 * <p>
	 * Default stroke width when hovered
	 * </p>
	 * 
	 * <p>
	 * Default {@code 1}
	 * </p>
	 */
	public void setHoverBorderWidth(BigDecimal hoverBorderWidth) {
	    this.hoverBorderWidth = hoverBorderWidth;
	}

}
